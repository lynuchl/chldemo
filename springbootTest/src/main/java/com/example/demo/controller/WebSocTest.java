/*
author:chaohl
*/
package com.example.demo.controller;

import com.example.demo.service.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class WebSocTest {
//    SimpleSocketServer
//    @Autowired
//   public SimpMessagingTemplate simpMessagingTemplate;
//
//    public Message WTest(Message message){
//
//        return message;
//    }
//
//    public void WTest1(Message message){
//
//        simpMessagingTemplate.send("",message);
//    }
    @Autowired
  private  WebSocket webSocket;

    @RequestMapping("/wstest")
    public void WSTest()throws Exception{



        System.out.println("wsTest");
        webSocket.sendMessage("this is server message");
    }



}
