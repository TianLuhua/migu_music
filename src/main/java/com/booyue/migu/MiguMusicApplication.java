package com.booyue.migu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.booyue.migu.dao")
public class MiguMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiguMusicApplication.class, args);

    }


}
