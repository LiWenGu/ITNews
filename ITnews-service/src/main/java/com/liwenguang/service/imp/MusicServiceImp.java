package com.liwenguang.service.imp;

import com.liwenguang.dao.MusicDao;
import com.liwenguang.domain.Music;
import com.liwenguang.service.MusicService;
import org.springframework.stereotype.Service;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
@Service
public class MusicServiceImp implements MusicService {

    private final MusicDao musicDao;

    public MusicServiceImp(MusicDao musicDao) {
        this.musicDao = musicDao;
    }

    @Override
    public Music getMusic(Integer id) {
        return musicDao.findByAll(id);
    }

    @Override
    public Boolean insertMusic(Music music) {
        musicDao.insertMusic(music);
        return true;
    }
}
