package com.example.demo.util;

import java.util.List;

public class json {

    private String msg;
    private String code;
    private List list;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public json() {
    }

    public json(String msg, String code, List list) {
        this.msg = msg;
        this.code = code;
        this.list = list;
    }
}
