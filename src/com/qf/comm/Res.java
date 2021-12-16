package com.qf.comm;

public class Res<T> {
    private int code;
    private String msg;
    private T date;
    private PageInfo pageInfo;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public static Res success(){
        return new Res(CodeMsg.SUCCESS);
    }
    public static Res success(CodeMsg cm){
        return new Res(cm);
    }
    public static<T> Res<T> success(CodeMsg cm,T date){
        return new Res(cm,date);
    }
    public static Res error(){
        return new Res(CodeMsg.Error);
    }
    public static Res error(CodeMsg cm){
        return new Res(cm);
    }
    public Res(CodeMsg cm, T date) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
        this.date = date;
    }

    public Res(CodeMsg cm) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getDate() {
        return date;
    }
}
