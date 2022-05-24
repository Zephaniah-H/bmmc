package com.zpheak.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Zephaniah.
 * @create: 2022-05-24 1:06
 */
@SpringBootApplication
@MapperScan("com.zpheak.book.dao")
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}
