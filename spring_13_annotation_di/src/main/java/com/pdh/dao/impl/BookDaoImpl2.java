package com.pdh.dao.impl;

import com.pdh.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")

public class BookDaoImpl2 implements BookDao {

    @Value("${name}")
    private String name;
    public void save(){
//        System.out.println("book dao save..."+name);
        System.out.println("book dao save...2"+name);
    }



}
