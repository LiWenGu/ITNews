package com.liwenguang.service.imp.jianshu;

import com.liwenguang.service.JianShuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootApplication
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestJianShuService {

    @Autowired
    JianShuService jianShuService;

    @Test
    public void testgetList() {
        jianShuService.getList("java", "note", 1, OrderByEnum.DEFAULT.getName());
    }
}
