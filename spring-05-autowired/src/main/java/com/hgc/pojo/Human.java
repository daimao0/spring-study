package com.hgc.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

/**
 * @Author:daMao
 * @Date: Created in 6:11 2020/7/1
 */
@Data

public class Human {
    //先通过名字查找再通过类型查找
    @Resource(name = "cat")
    private Cat cat;

    @Resource
    private Dog dog;

    private String name;

    public Human(@Nullable String name) {
        this.name = name;
    }

}
