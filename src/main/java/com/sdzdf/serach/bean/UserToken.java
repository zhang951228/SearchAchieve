package com.sdzdf.serach.bean;

import java.io.Serializable;

public class UserToken implements Serializable {

    private static final long serialVersionUID = -2414443061696200360L;


    private String yhzh; //用户账户
    private String yhmm;//密码
    private String yhlx;//用户类型
    private String xm;//用户姓名
    private String slid;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getYhzh() {
        return yhzh;
    }

    public void setYhzh(String yhzh) {
        this.yhzh = yhzh;
    }

    public String getYhmm() {
        return yhmm;
    }

    public void setYhmm(String yhmm) {
        this.yhmm = yhmm;
    }

    public String getYhlx() {
        return yhlx;
    }

    public void setYhlx(String yhlx) {
        this.yhlx = yhlx;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSlid() {
        return slid;
    }

    public void setSlid(String slid) {
        this.slid = slid;
    }
}
