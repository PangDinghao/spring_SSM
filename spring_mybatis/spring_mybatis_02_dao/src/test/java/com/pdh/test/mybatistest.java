package com.pdh.test;

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

    @Test
    public void testselect() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id
        List<User> userList = sqlSession.selectList("userMapper.findAll");
        //打印
        System.out.println(userList);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testselectByCondition() throws IOException {

        User user = new User();
//        user.setId("1");
        user.setPsw("2222");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id
        List<User> userList = sqlSession.selectList("userMapper.selectByCondition",user);
        //打印
        System.out.println(userList);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testsave() throws IOException {
        User user = new User();
        user.setId("112211");
        user.setPsw("121121");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id ,object
        sqlSession.insert("userMapper.save",user);

        //如果执行更新操作 需要提交事物
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testupdate() throws IOException {
        User user = new User();
        user.setId("1111");
        user.setPsw("1111");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id ,object
        sqlSession.update("userMapper.update",user);
        //如果执行更新操作 需要提交事物
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testdelete() throws IOException {
        User user = new User();
        user.setId("1111");
        user.setPsw("1111");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id ,object
        sqlSession.delete("userMapper.delete",user);
        //如果执行更新操作 需要提交事物
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //查询一个对象
    @Test
    public void testselectById() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("Mybatis_Config.xml");
        ///获取session工程对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作  参数 namespace.id
        User user = sqlSession.selectOne("userMapper.findById", 1);
        //打印
        System.out.println(user);
        //释放资源
        sqlSession.close();
    }
}
