package com.pdh.dao.factory;

import com.pdh.dao.OrderDao;
import com.pdh.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup ...");
        return new OrderDaoImpl();
    }
}
