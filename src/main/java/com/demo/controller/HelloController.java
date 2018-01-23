package com.demo.controller;

import com.demo.excepetion.BusinsessException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${wenhua.hi}")
    private String msg;
    @RequestMapping("/")
    String home() {
       /* int i=1/0;*/
        /*throw new BusinsessException("100","自定义异常");*/
        return this.msg;
    }
}