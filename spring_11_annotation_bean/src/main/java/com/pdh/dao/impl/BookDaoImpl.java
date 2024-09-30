package com.pdh.dao.impl;

import com.pdh.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.beans.ConstructorProperties;
import java.util.*;
import java.util.stream.BaseStream;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    /*private String name;

    public void setName(String name) {
        this.name = name;
    }*/

    public void save(){
//        System.out.println("book dao save..."+name);
        System.out.println("book dao save...");

    }



}
