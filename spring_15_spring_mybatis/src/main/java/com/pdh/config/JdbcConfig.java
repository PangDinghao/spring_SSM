package com.pdh.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.pdh.dao.AccountDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration

public class JdbcConfig {
    //1.定义一个方法获得哟啊管理的对象
    //2.添加@bean，表示当前方法的返回值是一个bean
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(AccountDao accountDao){

        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setPassword(password);
        ds.setUsername(username);
        return ds;
    }
}
