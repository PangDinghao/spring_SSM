package com.pdh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//用于设置当前类为配置类
@Configuration
//扫描路径
@ComponentScan("com.pdh")
//加载外部文件
@PropertySource({"jdbc.properties","jdbc.properties"})
public class SpringConfig {
    //加载配置类初始化容器
}
