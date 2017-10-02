package com.liwenguang.domain;

import java.util.Date;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
public class FavoriteMusic {
    private String name;
    private Integer type;
    private String total;
    private Date updateTime;
    private Date createTime;

    public FavoriteMusic() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
