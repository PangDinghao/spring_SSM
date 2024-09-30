package com.pdh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//用于设置当前类为配置类
@Configuration
//扫描路径
@ComponentScan("com.pdh")
public class SpringConfig {
    //加载配置类初始化容器
}
