package com.example2.demo;

import javafx.application.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 部署到tomcat
 *在pom.xml的目录输入下面这句话打包
 * mvn clean package -Dmaven.test.skip=true
 * @Author: wwb
 * @Date: 2020/5/3 16:48
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(Application.class);
    }
}