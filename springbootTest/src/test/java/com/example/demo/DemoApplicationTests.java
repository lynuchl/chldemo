package com.example.demo;

import com.example.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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


}
