package com.pdh.service.impl;

import com.pdh.dao.BookDao;
import com.pdh.service.BookService;

import java.beans.ConstructorProperties;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();

    }
//  提供对应的set方法

}
