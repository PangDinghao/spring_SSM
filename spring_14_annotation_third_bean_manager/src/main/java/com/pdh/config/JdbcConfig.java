package com.pdh.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.pdh.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration

public class JdbcConfig {
    //1.定义一个方法获得哟啊管理的对象
    //2.添加@bean，表示当前方法的返回值是一个bean
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://3306/spring_db")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;

    @Bean
    public DataSource dataSource(BookDao bookDao){

        System.out.println(bookDao);

        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setPassword(password);
        ds.setUsername(username);
        return ds;
    }
}
