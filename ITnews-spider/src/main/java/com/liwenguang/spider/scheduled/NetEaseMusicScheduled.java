package com.liwenguang.spider.scheduled;

import com.liwenguang.spider.pipeline.NetEaseMusicPipeline;
import com.liwenguang.spider.processor.NetEaseMusicPageProcessor;
import com.liwenguang.spider.util.NetEaseMusicUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;

import static com.liwenguang.spider.processor.NetEaseMusicPageProcessor.START_URL;

/**
 * Created by liwenguang on 2017/10/2.
 * Author : LiWenGuang
 */
@Component
public class NetEaseMusicScheduled{

    @Autowired
    private NetEaseMusicPageProcessor netEaseMusicPageProcessor;

    @Autowired
    private NetEaseMusicPipeline netEaseMusicPipeline;

    @Scheduled(fixedRate = 10000)//(cron = "0 0 0/2 * * ? ")//从0点开始,每2个小时执行一次
    public void netEaseMusicScheduled() {
        long start = System.currentTimeMillis();
        Spider.create(netEaseMusicPageProcessor)
                .addUrl(START_URL)
                .addPipeline(netEaseMusicPipeline)
                .thread(5)
                .run();
        long end = System.currentTimeMillis();
        System.out.println("爬虫结束，耗时--->" + NetEaseMusicUtils.parseMillisecone(end - start));
    }
}
