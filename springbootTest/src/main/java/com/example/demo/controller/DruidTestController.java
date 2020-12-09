/*
author:chaohl
*/
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DruidTestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/druidUITest")
    public List DruidUITest(){
      List users=  jdbcTemplate.queryForList("select * from user");
      return users;
    }
}
