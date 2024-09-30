package com.pdh.test;

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


    /*findAll*/
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


}
