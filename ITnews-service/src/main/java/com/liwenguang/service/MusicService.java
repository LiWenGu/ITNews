package com.liwenguang.service;

import com.liwenguang.domain.Article;
import com.liwenguang.domain.Music;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
public interface MusicService {

    Music getMusic(Integer id);

    Boolean insertMusic(Music music);
}
