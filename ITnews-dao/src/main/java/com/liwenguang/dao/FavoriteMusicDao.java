package com.liwenguang.dao;

import com.liwenguang.domain.FavoriteMusic;
import com.liwenguang.domain.Music;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
@Mapper
public interface FavoriteMusicDao {

    @Select("SELECT * FROM favorite_music WHERE id = #{id}")
    FavoriteMusic findByAll(Integer id);

    /**
     * 数据库建立联合索引name、type，这样可以唯一识别用户，以使用INSERT INTO..ON DUPLICATE KEY UPDATE ...
     * 方便实现：如果不存在则插入，如果存在则更新
     * @return
     */
    @Insert("INSERT INTO favorite_music (`name`, `type`, `total`, `update_time`, `create_time`) VALUES " +
            "(#{name}, #{type}, #{total}, #{updateTime}, #{createTime}) ON DUPLICATE KEY UPDATE " +
            "favorite_music.total=#{total}, favorite_music.update_time=#{updateTime}")
    int insertFavoriteMusic(FavoriteMusic favoriteMusic);
}
