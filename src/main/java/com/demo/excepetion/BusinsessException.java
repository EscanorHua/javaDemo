package com.demo.excepetion;

/**
 * Created by Administrator on 2018/1/19.
 */
public class BusinsessException extends RuntimeException {
    private  String code;
    private String msg;

    public BusinsessException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
