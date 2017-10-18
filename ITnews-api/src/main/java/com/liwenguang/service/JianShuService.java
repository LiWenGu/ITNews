package com.liwenguang.service;

import com.liwenguang.service.bean.JianShuListBean;

public interface JianShuService {
    JianShuListBean getList(String keyword, String type, int pageNo, String orderBy);
}
