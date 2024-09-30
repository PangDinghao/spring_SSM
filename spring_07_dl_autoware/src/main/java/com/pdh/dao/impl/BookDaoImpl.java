package com.pdh.dao.impl;

import com.pdh.dao.BookDao;

import java.beans.ConstructorProperties;
import java.util.stream.BaseStream;


public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private  String databaseName;

    @ConstructorProperties({"connectionNum","databaseName"})
    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    public void save(){
        System.out.println("book dao save..."+connectionNum+","+databaseName);
    }



}
