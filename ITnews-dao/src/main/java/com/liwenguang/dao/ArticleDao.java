package com.liwenguang.dao;

import com.liwenguang.domain.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
@Mapper
public interface ArticleDao {

    @Select(value = "select title from article where id = #{id}")
    Article findByAll(Integer id);

    @Insert("insert into title (`title`,`bodyId`) values (#{title}, #{bodyId})")
    int insertArticle(Article jobInfo);
}
