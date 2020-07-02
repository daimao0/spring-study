package com.hgc.demo02;

import lombok.Setter;

/**
 * @Author:daMao
 * @Date: Created in 7:03 2020/7/2
 */
@Setter
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
    }

    @Override
    public void update() {
        log("update");
    }

    @Override
    public void query() {
        log("query");
    }

    //日志方法
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
