package com.liwenguang.service.imp;

import com.liwenguang.dao.ArticleDao;
import com.liwenguang.domain.Article;
import com.liwenguang.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
@Service
public class ArticleServiceImp implements ArticleService {

    private final ArticleDao articleDao;

    public ArticleServiceImp(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @Override
    public Article getOneArticle(Integer id) {
        return articleDao.findByAll(id);
    }

    @Override
    public Boolean insertArticle(Article article) {
        int result = articleDao.insertArticle(article);
        return true;
    }
}
