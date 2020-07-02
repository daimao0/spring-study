package com.hgc.demo02;

/**
 * @Author:daMao
 * @Date: Created in 7:01 2020/7/2
 */
public class Client {
    public static void main(String[] args) {

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(new UserServiceImpl());
        proxy.add();
    }
}
