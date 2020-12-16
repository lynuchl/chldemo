/*
author:chaohl
*/
package com.example.demo.service;

import com.example.demo.interf.InterfProxyA;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClazzProxyA implements InterfProxyA {


    @Override
    public void server() {

      log.info("this is a proxya test!");
    }
}
