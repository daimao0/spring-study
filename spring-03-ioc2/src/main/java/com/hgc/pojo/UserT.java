package com.hgc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author:daMao
 * @Date: Created in 6:13 2020/6/30
 */
@Data
@AllArgsConstructor
public class UserT {
    public UserT(){
        System.out.println("初始化UserT");
    }

    private String name;
}
