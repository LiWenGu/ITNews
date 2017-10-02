package com.liwenguang.spider.scheduled;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liwenguang on 2017/10/2.
 * Author : LiWenGuang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestConfiguration
public class NetEaseMusicScheduledTest {

    @Autowired
    private NetEaseMusicScheduled netEaseMusicScheduled;

    @Test
    public void testShow() {
        netEaseMusicScheduled.netEaseMusicScheduled();
    }
}
