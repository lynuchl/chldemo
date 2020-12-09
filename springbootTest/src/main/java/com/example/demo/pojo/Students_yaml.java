/*
author:chaohl
*/
package com.example.demo.pojo;


//import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
//import javax.validation.constraints.Email;


@Component

//绑定yaml配置文件的值
@ConfigurationProperties(prefix = "student")
/*
//获取properties文件的值
//@propertySource(value="classpath:xxx.properties")
 */

@Validated
public class Students_yaml {



/*
  @Email
   */

    public String name;
    public String password;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Students_yaml{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
