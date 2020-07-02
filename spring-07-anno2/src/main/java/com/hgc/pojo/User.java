package com.hgc.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author:daMao
 * @Date: Created in 6:16 2020/7/2
 */
@Data
@Component
public class User {
    @Value("张三")
    private String name;
}
