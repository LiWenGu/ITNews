package com.liwenguang.api;

import com.liwenguang.service.JianShuService;
import com.liwenguang.service.bean.JianShuListBean;
import com.liwenguang.service.imp.jianshu.OrderByEnum;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by liwenguang on 2017/10/1.
 * Author : LiWenGuang
 */
@RestController
@RequestMapping("/api/jianshu")
public class JianShuController {

    @Autowired
    private JianShuService jianShuService;

    @ApiOperation(value = "获取简书文章列表页面")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "keyword", value = "搜索关键字", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "pageNo", value = "当前页码", required = true, paramType = "query", dataType = "int")
    })
    @RequestMapping(path = "/list", method = GET)
    public JianShuListBean getList(
            @RequestParam(value = "keyword") String keyword,
            @RequestParam(value = "pageNo") int pageNo,
            @RequestParam(value = "orderBy") OrderByEnum orderBy,
            HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return jianShuService.getList(keyword, "note", pageNo, orderBy.getName());
    }
}
