package com.nicomama.vo;

import java.util.List;

public class PageData<T> {
    private int code;
    private String msg;
    private int total;
    private int pageNo;
    private int pageSize;
    private List<T> data;

    public PageData(int code, List<T> datas, int pageNo, int pageSize) {
        this(code, null, datas, pageNo, pageSize);
    }

    public PageData(int code, String msg, List<T> data, int pageNo, int pageSize) {
        this.code = code;
        this.msg = msg;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.data = data;
    }

    public PageData(int code, List<T> data, int total, int pageNo, int pageSize) {
        this(code, data, pageNo, pageSize);
        this.total = total;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
