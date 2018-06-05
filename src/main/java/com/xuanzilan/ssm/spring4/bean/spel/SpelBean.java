package com.xuanzilan.ssm.spring4.bean.spel;

public class SpelBean {
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private String item5;

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public int getItem4() {
        return item4;
    }

    public void setItem4(int item4) {
        this.item4 = item4;
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5;
    }

    @Override
    public String toString() {
        return "SpelBean{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                ", item4=" + item4 +
                ", item5='" + item5 + '\'' +
                '}';
    }

    public String getString(){
        return "ABC";
    }
}
