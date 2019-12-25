package com.sdzdf.serach.bean;

/**
 * @Auther: z151
 * @Date: 2019/12/25 16:15
 */
public class KmcjbBean {

    private String slid;
    private String ksid;
    private String ksdm;
    private String kmdm;
    private String ksh;
    private String xm;
    private String bmh;
    private String zzdm;
    private String kc;
    private String zh;
    private String bj;
    private String pm;
    private String xxpm;
    private String bjpm;
    private String kmcj;
    private String kgtcj;
    private String zgtcj;

    public KmcjbBean(String slid, String ksdm, String kmdm, String ksid) {
        this.slid = slid;
        this.ksdm = ksdm;
        this.kmdm = kmdm;
        this.ksid = ksid;
    }

    @Override
    public String toString() {
        return "KmcjbBean{" +
                "slid='" + slid + '\'' +
                ", ksid='" + ksid + '\'' +
                ", ksdm='" + ksdm + '\'' +
                ", kmdm='" + kmdm + '\'' +
                ", ksh='" + ksh + '\'' +
                ", xm='" + xm + '\'' +
                ", bmh='" + bmh + '\'' +
                ", zzdm='" + zzdm + '\'' +
                ", kc='" + kc + '\'' +
                ", zh='" + zh + '\'' +
                ", bj='" + bj + '\'' +
                ", pm='" + pm + '\'' +
                ", xxpm='" + xxpm + '\'' +
                ", bjpm='" + bjpm + '\'' +
                ", kmcj='" + kmcj + '\'' +
                ", kgtcj='" + kgtcj + '\'' +
                ", zgtcj='" + zgtcj + '\'' +
                '}';
    }

    public String getSlid() {
        return slid;
    }

    public void setSlid(String slid) {
        this.slid = slid;
    }

    public KmcjbBean(String ksid) {
        this.ksid = ksid;
    }

    public KmcjbBean() {
    }

    public String getKsid() {
        return ksid;
    }

    public void setKsid(String ksid) {
        this.ksid = ksid;
    }

    public String getKsh() {
        return ksh;
    }

    public void setKsh(String ksh) {
        this.ksh = ksh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getBmh() {
        return bmh;
    }

    public void setBmh(String bmh) {
        this.bmh = bmh;
    }

    public String getZzdm() {
        return zzdm;
    }

    public void setZzdm(String zzdm) {
        this.zzdm = zzdm;
    }

    public String getKc() {
        return kc;
    }

    public void setKc(String kc) {
        this.kc = kc;
    }

    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getXxpm() {
        return xxpm;
    }

    public void setXxpm(String xxpm) {
        this.xxpm = xxpm;
    }

    public String getBjpm() {
        return bjpm;
    }

    public void setBjpm(String bjpm) {
        this.bjpm = bjpm;
    }

    public String getKmcj() {
        return kmcj;
    }

    public void setKmcj(String kmcj) {
        this.kmcj = kmcj;
    }

    public String getKgtcj() {
        return kgtcj;
    }

    public void setKgtcj(String kgtcj) {
        this.kgtcj = kgtcj;
    }

    public String getZgtcj() {
        return zgtcj;
    }

    public void setZgtcj(String zgtcj) {
        this.zgtcj = zgtcj;
    }

    public String getKsdm() {
        return ksdm;
    }

    public void setKsdm(String ksdm) {
        this.ksdm = ksdm;
    }

    public String getKmdm() {
        return kmdm;
    }

    public void setKmdm(String kmdm) {
        this.kmdm = kmdm;
    }
}
