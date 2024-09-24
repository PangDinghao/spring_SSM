package com.pdh.dao.impl;

import com.pdh.dao.OrderDao;
import com.pdh.dao.UserDao;

public class UserDaoImpl implements UserDao {
//spring创建bean时调用无参构造
    public UserDaoImpl() {
        System.out.println("UserDao constructor is running...");

    }

    public void save(){

        System.out.println("User dao save...");
    }

}
