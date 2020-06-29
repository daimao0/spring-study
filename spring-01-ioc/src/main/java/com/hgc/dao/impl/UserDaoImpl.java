package com.hgc.dao.impl;

import com.hgc.dao.UserDao;

/**
 * @Author:daMao
 * @Date: Created in 4:41 2020/6/30
 */
public class UserDaoImpl implements UserDao {
    private UserDao userDao;
    @Override
    public void getUser() {
        System.out.println("默认获取用户数据");
    }

}
