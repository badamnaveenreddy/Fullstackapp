package com.vvitu.springboot_web_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.vvitu.springboot_web_data.repository")
public class FullstackappApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullstackappApplication.class, args);
    }
}
