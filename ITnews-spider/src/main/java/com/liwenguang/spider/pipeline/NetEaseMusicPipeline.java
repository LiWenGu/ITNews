package com.liwenguang.spider.pipeline;

import com.liwenguang.domain.FavoriteMusic;
import com.liwenguang.domain.Music;
import com.liwenguang.service.FavoriteMusicService;
import com.liwenguang.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

/**
 * Created by liwenguang on 2017/10/2.
 * Author : LiWenGuang
 */
@Component
public class NetEaseMusicPipeline implements Pipeline {


    @Autowired
    private MusicService musicService;

    @Autowired
    private FavoriteMusicService favoriteMusicService;

    @Override
    public void process(ResultItems resultItems, Task task) {
        FavoriteMusic favoriteMusic = resultItems.get("myFavoritePlayList");
        if (favoriteMusic != null) {
            favoriteMusicService.insert(favoriteMusic);
        }
        Music music = resultItems.get("netEaseMusic");
        if (music != null) {
            musicService.insertMusic(music);
        }
    }
}
