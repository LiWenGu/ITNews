package com.liwenguang.dao;

import com.liwenguang.domain.Music;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
@Mapper
public interface MusicDao {

    @Select(value = "select title from article where id = #{id}")
    Music findByAll(Integer id);

    @Insert("insert into music (`title`,`author`) values (#{title}, #{author})")
    int insertMusic(Music music);
}
