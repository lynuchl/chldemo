/*
author:chaohl
*/
package com.example.demo.controller;

import com.example.demo.pojo.Students_Value;
import com.example.demo.pojo.Students_yaml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class helloTest {

    @Autowired
    public Students_Value studentsValue;

    @Autowired
    public Students_yaml studentsYaml;

    @RequestMapping("hello")
    public String hello() {

        System.out.println("hello world");


        System.out.println(studentsYaml.toString());
        //new 创建对象
//        Students students=new Students();
//        students.username="chaohl";
//        students.password="123";
        System.out.println(studentsValue.toString());

        return "hello world";
    }
}
