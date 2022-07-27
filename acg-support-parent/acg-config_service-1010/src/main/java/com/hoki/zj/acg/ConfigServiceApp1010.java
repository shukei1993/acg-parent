package com.hoki.zj.acg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // ConfigServer
@ServletComponentScan("com.hoki.zj.hrm.filter")
public class ConfigServiceApp1010 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApp1010.class, args);
    }
}
