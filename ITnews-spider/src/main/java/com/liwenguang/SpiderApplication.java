package com.liwenguang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling             // 支持定时任务
public class SpiderApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpiderApplication.class, args);
    }
}

