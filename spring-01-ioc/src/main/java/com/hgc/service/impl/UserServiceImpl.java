package com.hgc.service.impl;

import com.hgc.dao.UserDao;
import com.hgc.dao.impl.UserDaoImpl;
import com.hgc.service.UserService;

/**
 * @Author:daMao
 * @Date: Created in 4:42 2020/6/30
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public void getUser() {
        userDao.getUser();
    }


    @Override
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
}
