package com.suse.blog_cy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.suse.blog_cy")
@SpringBootApplication
public class BlogCyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogCyApplication.class, args);
    }

}
