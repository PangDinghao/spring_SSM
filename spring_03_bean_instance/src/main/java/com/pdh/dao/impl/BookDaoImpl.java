package com.pdh.dao.impl;

import com.pdh.dao.BookDao;

import java.util.stream.BaseStream;

public class BookDaoImpl implements BookDao {
//spring创建bean时调用无参构造
    private BookDaoImpl() {
        System.out.println("bookDao constructor is running...");

    }

    public void save(){

        System.out.println("book dao save...");
    }

}
