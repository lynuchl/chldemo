/*
author:chaohl
*/
package com.example.demo.config;

import com.example.demo.service.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class SaticScheduleTask {
    @Autowired
    private WebSocket webSocket;

//    @Autowired
//    private CustomerKafka customerKafka;
    //3.添加定时任务
    @Scheduled(cron = "0/5 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)

    public void configureTasks(){


        webSocket.sendMessage("执行静态定时任务时间: " + LocalDateTime.now());
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }
}
