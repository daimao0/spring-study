package com.hgc.service;

import com.hgc.dao.UserDao;

/**
 * @Author:daMao
 * @Date: Created in 4:42 2020/6/30
 */
public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
