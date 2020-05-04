package com.example2.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dffsdgag
 *
 * @Author: wwb
 * @Date: 2020/4/30 09:47
 */
//@Controller
@RestController
@RequestMapping("/tt")
public class HelloController {
    @Value("${my.prop}")
    String mystr;
    @RequestMapping("/hello")
    public String hello(){
        return "HelloString 05-03 yyp"+mystr;
    }
    public static void main(String[] args) {

    }
}