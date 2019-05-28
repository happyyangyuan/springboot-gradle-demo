package com.cedarhd.cedarservice.housekeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * springboot程序入口
 * Created by happyyangyuan at 2018/1/26
 */
@SpringBootApplication
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        /*System.setProperty("spring.profiles.active", "dev");*/
        SpringApplication.run(Application.class, args);
    }

}
