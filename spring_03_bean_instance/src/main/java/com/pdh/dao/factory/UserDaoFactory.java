package com.pdh.dao.factory;

import com.pdh.dao.UserDao;
import com.pdh.dao.impl.OrderDaoImpl;
import com.pdh.dao.impl.UserDaoImpl;

public class UserDaoFactory {

        public UserDao getUserDao(){
            System.out.println("factory setup ...");
            return new UserDaoImpl();
        }

}
