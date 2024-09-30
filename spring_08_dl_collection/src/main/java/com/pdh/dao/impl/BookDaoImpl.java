package com.pdh.dao.impl;

import com.pdh.dao.BookDao;

import java.beans.ConstructorProperties;
import java.util.*;
import java.util.stream.BaseStream;


public class BookDaoImpl implements BookDao {

    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save(){
        System.out.println("book dao save...");

        System.out.println("数组:"+ Arrays.toString(array));

        System.out.println("List:" + list);

        System.out.println("Set:" + set);

        System.out.println("Map:" + map);

        System.out.println("Properties:" + properties);
    }



}
