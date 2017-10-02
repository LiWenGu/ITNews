package com.liwenguang.domain;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
public class Article {
    private String title;
    private String bodyId;

    public Article() {

    }

    public Article(String title) {
        this.title = title;
    }

    public Article(String title, String bodyId) {
        this.title = title;
        this.bodyId = bodyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyId() {
        return bodyId;
    }

    public void setBodyId(String bodyId) {
        this.bodyId = bodyId;
    }
}
