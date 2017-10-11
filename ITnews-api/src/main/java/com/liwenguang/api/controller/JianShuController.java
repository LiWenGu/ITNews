package com.liwenguang.api.controller;

import com.liwenguang.service.third.jianshu.OrderByEnum;
import com.liwenguang.service.third.jianshu.JianShuService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public Object getList(
            @RequestParam(value = "keyword") String keyword,
            @RequestParam(value = "pageNo") int pageNo,
            @RequestParam(value = "orderBy") OrderByEnum orderBy) {
        return jianShuService.getList(keyword, "note", pageNo, orderBy.getName());
    }
}
