package com.pdh.service.impl;

import com.pdh.dao.BookDao;
import com.pdh.dao.UserDao;
import com.pdh.service.BookService;

import java.beans.ConstructorProperties;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private UserDao userDao;
    @ConstructorProperties({"bookDao","userDao"})
    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
//  提供对应的set方法

}
