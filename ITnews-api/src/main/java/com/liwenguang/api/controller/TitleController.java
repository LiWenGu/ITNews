package com.liwenguang.api.controller;

import com.liwenguang.domain.Article;
import com.liwenguang.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
@RestController
@RequestMapping("/api")
public class TitleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getTitle")
    public Article getTitle(@RequestParam(value = "id", defaultValue = "id") Integer id) {
        return articleService.getOneArticle(id);
    }
}
