package com.xuanzilan.ssm.spring4.bean.annotation;

import org.springframework.stereotype.Component;

@Component("myTeacher")
public class Teacher extends Person{
    private int tid;
    private String tname;
    private int tage;
    private String addr;
    private String school;

    public Teacher() {
        System.out.println("初始化teacher");
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTage() {
        return tage;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tage=" + tage +
                ", addr='" + addr + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
