package com.hoki.zj.acg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApp2010 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApp2010.class, args);
    }
}
