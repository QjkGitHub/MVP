package com.qf.comm;

public enum CodeMsg {
    SUCCESS(200,"success"),
    Error(500,"error");
    private Integer code;
    private String msg;

    CodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
