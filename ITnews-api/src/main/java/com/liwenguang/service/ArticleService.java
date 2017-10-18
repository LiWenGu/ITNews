package com.liwenguang.service;

import com.liwenguang.domain.Article;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
public interface ArticleService {
    Article getOneArticle(Integer id);

    Boolean insertArticle(Article article);
}
