package com.liwenguang.service.imp.jianshu;

import com.alibaba.fastjson.JSON;
import com.liwenguang.service.JianShuService;
import com.liwenguang.service.bean.JianShuListBean;
import com.liwenguang.service.utils.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static com.liwenguang.service.utils.Constants.LIST_URL;
import static com.liwenguang.service.utils.Constants.MAX_RETRY_COUNT;

@Service
public class JianShuServiceImp implements JianShuService {

    private Logger logger = LoggerFactory.getLogger(JianShuServiceImp.class);

    @Override
    public JianShuListBean getList(String keyword, String type, int pageNo, String orderBy) {
        StringBuilder params = new StringBuilder();
        params.append("q=").append(keyword)
                .append("&type=").append(type)
                .append("&page=").append(pageNo)
                .append("&order_by=").append(orderBy);
        int tryCount = MAX_RETRY_COUNT;  // 重试次数
        String jsonObject = HttpRequest.sendGet(LIST_URL, params.toString(), tryCount);
        JianShuListBean jsonRootBean = JSON.parseObject(jsonObject, JianShuListBean.class);
        logger.info(jsonObject);
        return jsonRootBean;
    }
}
