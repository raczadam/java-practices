package com.example.crawler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CrawlerApplication {

    public static void main(String[] args) {
        log.info("Hello world!");
        SpringApplication.run(CrawlerApplication.class, args);
    }

}
