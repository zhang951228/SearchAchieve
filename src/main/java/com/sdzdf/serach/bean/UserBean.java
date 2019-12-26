package com.sdzdf.serach.bean;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class UserBean implements Serializable {

    private static final long serialVersionUID = -7797183521247423117L;

    private String yhzh; //用户账户
    private String yhmm;//密码
    private String yhlx;//用户类型
    private String xm;//用户姓名
    private String slid;
    private String qybz;
    private String yhzw;
    private String zcsj;
    private String zzdm;
    private String jysdm;
    private String bz;

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

    public String getQybz() {
        return qybz;
    }

    public void setQybz(String qybz) {
        this.qybz = qybz;
    }

    public String getYhzw() {
        return yhzw;
    }

    public void setYhzw(String yhzw) {
        this.yhzw = yhzw;
    }

    public String getZcsj() {
        return zcsj;
    }

    public void setZcsj(String zcsj) {
        this.zcsj = zcsj;
    }

    public String getZzdm() {
        return zzdm;
    }

    public void setZzdm(String zzdm) {
        this.zzdm = zzdm;
    }

    public String getJysdm() {
        return jysdm;
    }

    public void setJysdm(String jysdm) {
        this.jysdm = jysdm;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
