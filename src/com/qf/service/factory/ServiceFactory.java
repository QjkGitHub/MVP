package com.qf.service.factory;

public class ServiceFactory {
    //返回的对象是iservice接口的实现类
    public Object getService(String name){
        switch (name){
            case "":
                return null;
            default:
                return null;
        }
    }
}
