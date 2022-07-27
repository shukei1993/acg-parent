package com.hoki.zj.acg.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        resources.add(swaggerResource("系统管理服务", "/services/sysmanage/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("授权中心", "/services/auth/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("课程类型", "/services/course/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("用户中心", "/services/user/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("秒杀课程服务", "/services/killCourse/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("秒杀订单服务", "/services/killOrder/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("秒杀支付服务", "/services/killPay/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}