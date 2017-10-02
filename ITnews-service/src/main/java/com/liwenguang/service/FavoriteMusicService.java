package com.liwenguang.service;

import com.liwenguang.domain.Article;
import com.liwenguang.domain.FavoriteMusic;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
public interface FavoriteMusicService {

    FavoriteMusic getFavoriteMusic(Integer id);

    Boolean insert(com.liwenguang.domain.FavoriteMusic favoriteMusic);
}
