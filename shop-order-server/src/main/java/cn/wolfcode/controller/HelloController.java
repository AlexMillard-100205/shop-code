package cn.wolfcode.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    @Value("${appConfig.name}")
    private String appConfigName;

    @Value("${redisConfig.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "返回参数: "+appConfigName+" ,端口: "+port;
    }
}
