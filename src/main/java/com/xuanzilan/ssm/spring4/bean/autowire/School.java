package com.xuanzilan.ssm.spring4.bean.autowire;

public class School {
    private int id;
    private String sname;
    private City city;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", city=" + city +
                '}';
    }
}
