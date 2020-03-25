package com.jingtoo.demo.exceHandler;

public class Error {

    private int status;

    private String msg;

    public static Error error(int sta) {
        Error e = new Error();
        e.setStatus(sta);
        return e;
    }

    public static Error gete(int sta,String msg) {
        Error e = error(sta);
        e.setMsg(msg);
        return e;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
