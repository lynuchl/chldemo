/*
author:chaohl
*/
package com.example.demo.service;


import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
@ServerEndpoint("/webSocket")
//@Slf4j
@Logger
public class WebSocket {

    private Session session;

    private static CopyOnWriteArraySet<WebSocket> webSockets=new CopyOnWriteArraySet<>();

    @OnOpen
    public void onOpen(Session session){
        this.session=session;
        webSockets.add(this);
        System.out.println("有新的连接,总数:"+webSockets.size());
    }

    @OnClose
    public void onClose(){
        webSockets.remove(this);
        System.out.println("连接断开,当前总数"+webSockets.size());
    }

    @OnMessage
    public void onMessage(String message){

        System.out.println("收到客户端发送的消息:"+message);
    }

    public void sendMessage(String message){
        try {

        for(WebSocket webSocket: webSockets)
        {
        webSocket.session.getBasicRemote().sendText(message);
        }
        }catch (IOException e){

        }
    }

}
