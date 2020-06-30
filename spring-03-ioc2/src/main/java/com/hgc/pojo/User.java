package com.hgc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author:daMao
 * @Date: Created in 6:13 2020/6/30
 */
@Data
@AllArgsConstructor
public class User {
    public User(){
        System.out.println("初始化User");
    }

    private String name;
}
