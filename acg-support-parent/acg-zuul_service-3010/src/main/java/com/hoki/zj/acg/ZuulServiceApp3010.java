package com.hoki.zj.acg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServiceApp3010 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApp3010.class, args);
    }
}
