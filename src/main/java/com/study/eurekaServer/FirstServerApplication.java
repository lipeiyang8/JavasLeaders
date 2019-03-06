package com.study.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * FirstServerApplication实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-02-26 20:34:53
 */
@SpringBootApplication
@EnableEurekaServer
public class FirstServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstServerApplication.class, args);
    }
}
