package com.pdh.dao.impl;

import com.pdh.dao.BookDao;
import com.pdh.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
//spring创建bean时调用无参构造
    public OrderDaoImpl() {
        System.out.println("OrderDao constructor is running...");

    }

    public void save(){

        System.out.println("Order dao save...");
    }

}
