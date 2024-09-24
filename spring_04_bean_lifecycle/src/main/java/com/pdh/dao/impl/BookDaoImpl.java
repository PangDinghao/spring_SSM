package com.pdh.dao.impl;

import com.pdh.dao.BookDao;

import java.sql.SQLOutput;
import java.util.stream.BaseStream;

public class BookDaoImpl implements BookDao {
    public void save(){

        System.out.println("book dao save...");
    }
    //表示bean初始化对于的操作
    public void init(){
        System.out.println("init...");
    }
    //表示bean销毁前对应的操作
    public void Destory(){
        System.out.println("destory...");
    }

}
