package com.liwenguang.service.third.jianshu;

import com.liwenguang.service.third.utils.HttpRequest;
import org.springframework.stereotype.Service;

import static com.liwenguang.service.third.jianshu.Constants.LIST_URL;
import static com.liwenguang.service.third.jianshu.Constants.MAX_RETRY_COUNT;

@Service
public class JianShuService {

    public Object getList(String keyword, String type, int pageNo, String orderBy) {
        StringBuilder params = new StringBuilder();
        params.append("q=").append(keyword)
                .append("&type=").append(type)
                .append("&page=").append(pageNo)
                .append("&order_by=").append(orderBy);
        int tryCount = MAX_RETRY_COUNT;  // 重试次数
        return HttpRequest.sendGet(LIST_URL, params.toString(), tryCount);
    }
}
