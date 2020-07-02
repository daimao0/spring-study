package com.hgc.config;

import com.hgc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:daMao
 * @Date: Created in 6:18 2020/7/2
 */
//这个也会被Spring容器托管
@Configuration
@ComponentScan("com.hgc.pojo")
public class MyConfig {
    @Bean
    public User user(){
        return new User();
    }
}
