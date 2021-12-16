package com.qf.dao.factory;

public class DaoFactory {
    public Object getDao(String name){
        //返回的对象是idao接口的实现类
        switch (name){
            case "":
                return null;
            default:
                return null;
        }
    }
}
