/*
author:chaohl
*/
package com.example.demo.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态处理

public class ProxyAInvocationHandler implements InvocationHandler {





    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("你好");

        System.out.println("在一次你好");
        return null;
    }
}
