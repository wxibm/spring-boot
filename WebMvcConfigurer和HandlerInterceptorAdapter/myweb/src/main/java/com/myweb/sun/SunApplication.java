package com.myweb.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SunApplication {

    public static void main(String[] args) {
        System.out.println("========main开始========");
        SpringApplication.run(SunApplication.class, args);
        System.out.println("========main结束========");
    }
}
