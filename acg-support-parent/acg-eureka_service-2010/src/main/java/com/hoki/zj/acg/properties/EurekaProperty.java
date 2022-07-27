package com.hoki.zj.acg.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myself.data")
@Data
public class EurekaProperty {
    private String name;
    private Integer age;

}
