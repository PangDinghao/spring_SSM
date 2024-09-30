package com.pdh.dao.impl;

import com.pdh.dao.BookDao;
import com.pdh.dao.UserDao;

import java.beans.ConstructorProperties;


public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
    }

    public void save(){
        System.out.println("User dao save...");
    }



}
