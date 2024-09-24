package com.pdh.dao.factory;

import com.pdh.dao.UserDao;
import com.pdh.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

//实用
public class UserDaoFactoryBean  implements FactoryBean<UserDao> {
   //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }
    //
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        //false非单例对象
        return false;
    }
}
