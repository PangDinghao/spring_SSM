package com.pdh.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

//用于设置当前类为配置类
@Configuration
@ComponentScan("com.pdh")
@Import({JdbcConfig.class,})//导入配置类

public class SpringConfig {

}
