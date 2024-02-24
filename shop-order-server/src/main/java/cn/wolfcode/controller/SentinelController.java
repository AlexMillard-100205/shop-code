package cn.wolfcode.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class SentinelController {
    @RequestMapping("/sentinelOne")
    public String sentinelOne(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "sentinelOne";
    }

    @RequestMapping("/sentinelTwo")
    public String sentinelTwo(){
        log.info("你好世界");
        return "sentinelTwo";
    }
}
