/*
author:chaohl
*/
package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int id;
    private String username;
    private String password;
    private String realname;

//    @Override
//    public User clone()throws CloneNotSupportedException{
//        return (User) super.clone();
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}
