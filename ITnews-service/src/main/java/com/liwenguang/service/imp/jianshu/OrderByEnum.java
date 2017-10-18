package com.liwenguang.service.imp.jianshu;

public enum OrderByEnum {
    DEFAULT(1, "default"),
    COMMENT(2, "commented_at"),
    TOP(3, "top"),
    PUBLISH(4, "published_at");

    private int code;
    private String name;

    OrderByEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode(){
        return code;
    }

    public String getName() {
        return name;
    }
}
