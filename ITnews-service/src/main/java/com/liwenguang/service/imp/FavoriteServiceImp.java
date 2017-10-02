package com.liwenguang.service.imp;

import com.liwenguang.dao.FavoriteMusicDao;
import com.liwenguang.domain.FavoriteMusic;
import com.liwenguang.service.FavoriteMusicService;
import org.springframework.stereotype.Service;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
@Service
public class FavoriteServiceImp implements FavoriteMusicService {

    private final FavoriteMusicDao favoriteMusicDao;

    public FavoriteServiceImp(FavoriteMusicDao favoriteMusicDao) {
        this.favoriteMusicDao = favoriteMusicDao;
    }

    @Override
    public FavoriteMusic getFavoriteMusic(Integer id) {
        return favoriteMusicDao.findByAll(id);

    }

    @Override
    public Boolean insert(com.liwenguang.domain.FavoriteMusic favoriteMusic) {
        favoriteMusicDao.insertFavoriteMusic(favoriteMusic);
        return true;
    }
}
