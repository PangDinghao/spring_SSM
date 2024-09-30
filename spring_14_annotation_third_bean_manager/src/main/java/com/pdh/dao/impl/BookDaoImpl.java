package com.pdh.dao.impl;

import com.pdh.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.beans.ConstructorProperties;
import java.util.*;
import java.util.stream.BaseStream;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Repository

public class BookDaoImpl implements BookDao {

    public void save(){

        System.out.println("book dao save...1");
    }



}
