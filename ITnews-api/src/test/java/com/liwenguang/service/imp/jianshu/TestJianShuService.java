package com.liwenguang.service.imp.jianshu;

import com.liwenguang.ApiApplication;
import com.liwenguang.service.JianShuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class TestJianShuService {

    @Autowired
    JianShuService jianShuService;

    @Test
    public void testgetList() {
        jianShuService.getList("java", "note", 1, OrderByEnum.DEFAULT.getName());
    }
}
