package com.pdh.service.impl;

import com.pdh.dao.BookDao;
import com.pdh.dao.UserDao;
import com.pdh.service.BookService;

public class BookServiceImpl implements BookService {
//    5.删除业务层中使用New的方式创建dao对象
    private BookDao bookDao;
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


//  提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();

    }
}
