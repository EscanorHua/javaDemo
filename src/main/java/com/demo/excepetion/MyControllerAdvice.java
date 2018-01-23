package com.demo.excepetion;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/19.
 */
@ControllerAdvice
public class MyControllerAdvice {

    /**
     * 全局捕获异常类，只要作用在@RequestMapping方法上，所有的异常信息都会捕获到
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> errorHander(Exception e){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code","-1");
        map.put("msg","异常状态："+e.getMessage());
        return  map;
    }

    @ResponseBody
    @ExceptionHandler(value = BusinsessException.class)
    public Map<String,Object> errorHander(BusinsessException e){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code",e.getCode());
        map.put("msg","异常状态："+e.getMsg());
        return  map;
    }
}
