package com.sdzdf.serach.bean;

/**
 * @Auther: z151
 * @Date: 2019/12/25 13:13
 */
public class Student {
    private String slid;
    private String ksid;
    private String password;
    private String name;

    public Student() {
    }

    public Student(String slid) {
        this.slid = slid;
    }

    public String getSlid() {
        return slid;
    }

    public void setSlid(String slid) {
        this.slid = slid;
    }

    public String getKsid() {
        return ksid;
    }

    public void setKsid(String ksid) {
        this.ksid = ksid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
