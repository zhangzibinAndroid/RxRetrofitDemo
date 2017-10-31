package com.zzb.retrofitrxdemo.action;

/**
 * 作者： 张梓彬
 * 日期： 2017/10/31 0031
 * 时间： 上午 10:00
 * 描述： EventBus传递消息实体类
 */

public class EventBusMessage <T>{
    private String msg;
    private T t;

    public EventBusMessage(String msg, T t) {
        this.msg = msg;
        this.t = t;
    }

    public String getMsg() {
        return msg;
    }

    public T getT() {
        return t;
    }
}
