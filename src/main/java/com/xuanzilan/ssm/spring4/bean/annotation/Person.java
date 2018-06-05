package com.xuanzilan.ssm.spring4.bean.annotation;

public class Person {
    private String firstName;

    public Person() {
        System.out.println("初始化Person");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
