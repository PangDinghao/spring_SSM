package com.pdh.dao.impl;

import com.pdh.dao.BookDao;

import java.beans.ConstructorProperties;
import java.util.*;
import java.util.stream.BaseStream;


public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void save(){
        System.out.println("book dao save..."+name);


    }



}
