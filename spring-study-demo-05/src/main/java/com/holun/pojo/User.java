package com.holun.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //等价于applicationContext中的 <bean id="user" class="com.holun.pojo.User" />
public class User {
    @Value("李豪伦")  //等价于<property name="name" value="李豪伦" /> @Value注解还可以加在setName方法上
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
