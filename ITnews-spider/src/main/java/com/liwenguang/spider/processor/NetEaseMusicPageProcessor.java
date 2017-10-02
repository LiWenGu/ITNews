package com.liwenguang.spider.processor;

import com.liwenguang.domain.FavoriteMusic;
import com.liwenguang.domain.Music;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.Date;
import java.util.List;

/**
 * Created by liwenguang on 2017/10/2.
 * Author : LiWenGuang
 */
@Component
public class NetEaseMusicPageProcessor implements PageProcessor {

    public final static int NETEASE_MUSIC = 1;
    // 正则表达式\\. \\转义java中的\ \.转义正则中的.
    // 主域名
    public static final String BASE_URL = "http://music.163.com/";

    // 匹配歌单URL：http://music.163.com/#/playlist?id=91900801
    public static final String ALBUM_URL = "http://music\\.163\\.com/playlist\\?id=\\d+";

    // 匹配单个歌曲URL，以获取单个歌曲的详细，例如评论：http://music.163.com/song?id=3651
    public static final String MUSIC_URL = "http://music\\.163\\.com/song\\?id=\\d+";

    // 爬虫初始地址
    public static final String START_URL = "http://music.163.com/playlist?id=167092102";

    public static final int ONE_PAGE = 20;

    private Site site = Site.me()
            .setDomain("http://music.163.com")
            .setSleepTime(1000)
            .setRetryTimes(10)
            .setCharset("utf-8")
            .setTimeOut(50000)
            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_2) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");

    @Override
    public Site getSite() {
        return site;
    }

    @Override
    public void process(Page page) {
        Date date = new Date();
        // 根据URL判断页面类型
        // 列表页
        if (page.getUrl().regex(ALBUM_URL).match()) {
            // 爬取歌曲URl加入队列
            List<String> targetURL = page.getHtml().xpath("//div[@id=\"song-list-pre-cache\"]").links().regex(MUSIC_URL).all();
            page.addTargetRequests(targetURL);

            String total = page.getHtml().xpath("//span[@id='playlist-track-count']/text()").toString();
            String name = page.getHtml().xpath("//span[@class='name']/a[@class='s-fc7']/text()").toString();
            FavoriteMusic favoriteMusic = new FavoriteMusic();
            favoriteMusic.setName(name);
            favoriteMusic.setType(NETEASE_MUSIC);
            favoriteMusic.setTotal(total);
            favoriteMusic.setUpdateTime(date);
            favoriteMusic.setCreateTime(date);
            page.putField("myFavoritePlayList", favoriteMusic);
            //文章页
        } else {
            String url = page.getUrl().toString();
            String songId = url.substring(url.indexOf("id=") + 3);
            String name = page.getHtml().xpath("//em[@class='f-ff2']/text()").toString();
            String author = page.getHtml().xpath("//p[@class='des s-fc4']/span/a/text()").toString();
            Music music = new Music();
            music.setName(name);
            music.setAuthor(author);
            page.putField("netEaseMusic", music);
        }
    }
}
