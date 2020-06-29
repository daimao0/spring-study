package com.hgc.dao.impl;

import com.hgc.dao.UserDao;

/**
 * @Author:daMao
 * @Date: Created in 4:45 2020/6/30
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("MySQL调用用户数据");
    }
}
