package com.example2.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
//        System.out.println("123");
    }

    @Test
    public void  datasourceTest(){
        System.out.println("yyp test spbty");
        System.out.println(dataSource);
    }

}
