package com.pdh.dao.impl;

import com.pdh.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.beans.ConstructorProperties;
import java.util.*;
import java.util.stream.BaseStream;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    /*private String name;

    public void setName(String name) {
        this.name = name;
    }*/

    public void save(){
//        System.out.println("book dao save..."+name);
        System.out.println("book dao save...");
    }
    @PostConstruct
    public void init(){
        System.out.println("book dao init...");

    }
    @PreDestroy
    public void destroy(){
        System.out.println("book dao destroy...");

    }



}
