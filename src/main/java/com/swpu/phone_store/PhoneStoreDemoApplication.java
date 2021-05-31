package com.swpu.phone_store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.swpu.phone_store.mapper")
public class PhoneStoreDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoneStoreDemoApplication.class, args);
    }

}
