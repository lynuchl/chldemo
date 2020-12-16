package com.example.demo;

import com.example.demo.interf.InterfProxyA;
import com.example.demo.pojo.User;
import com.example.demo.service.ProxyAInvocationHandler;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests extends User{

    @Test
    void contextLoads() {
    }

    @Test
    public void test () throws CloneNotSupportedException{

        User user=new User();
        User user1=new User();
//        User user2=user.clone();
//        DemoApplicationTests demoApplicationTests=new DemoApplicationTests();
//        User user3= demoApplicationTests.clone();



        System.out.println("判断两对象是否相等:"+user.equals(user1));
//        System.out.println("判断克隆方法是否一致:"+user.equals(user2));
//        System.out.println("判断克隆方法是否一致:"+user.equals(user3));

    }


//    动态代理测试
    @Test
    public void proxTest(){

        Class [] interfaces={InterfProxyA.class};

        InvocationHandler invocationHandler=new ProxyAInvocationHandler();
       InterfProxyA interfProxyA=(InterfProxyA) Proxy.newProxyInstance(this.getClass().getClassLoader(),interfaces,invocationHandler);

       interfProxyA.server();
        log.info("hello world");
        System.out.println("hello ");
//        System.out.println("hello");
    }


}
