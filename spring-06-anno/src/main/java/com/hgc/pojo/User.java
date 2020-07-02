package com.hgc.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author:daMao
 * @Date: Created in 5:45 2020/7/2
 */
@Data
//等价于    <bean id="user" class="com.hgc.pojo.User"/>
//@Component 组件
@Component
@Scope("prototype")
public class User {
    //相当于 <property name="name" value="张三">
    @Value("张三")
    private String name;
}
