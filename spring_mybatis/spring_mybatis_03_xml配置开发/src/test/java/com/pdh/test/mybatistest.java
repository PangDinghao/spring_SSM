package com.pdh.test;

import com.pdh.entity.Orders;
import com.pdh.mapper.OrderMapper;
import com.pdh.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.pdh.entity.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatistest {

    /*一对一*/
    @Test
    public void test1() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Orders> ordersList = mapper.findAll();
        for(Orders order : ordersList){
            System.out.println(order);
        }

        sqlSession.close();
    }

    /*一对多*/
    @Test
    public void test2() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> ordersList = mapper.findAll();
        for(User user : ordersList){
            System.out.println(user);
        }

        sqlSession.close();
    }

    /*多对多*/
    @Test
    public void test3() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> ordersList = mapper.findUserAndRoleAll();
        for(User user : ordersList){
            System.out.println(user);
        }

        sqlSession.close();
    }
}
