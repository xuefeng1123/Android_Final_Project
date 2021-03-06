package com.example.as_final_project.entities;

public class MyResponse {
    private int code;            // 状态代码
    private String data;         // 数据
    private String errorMsg;    // 错误信息

    public MyResponse() {

    }

    public MyResponse(int code, String data, String errorMsg) {
        this.code = code;
        this.data = data;
        this.errorMsg = errorMsg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        String str = "code="
                + this.code
                + "\ndata=" + this.data
                + "\nerrorMsg=" + this.errorMsg;
        return str;
    }
}
