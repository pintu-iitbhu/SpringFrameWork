package org.springtutorial.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Starters {
    private String sName;
    private int sPrice;

    public Starters(String sName, int sPrice) {
        this.sName = sName;
        this.sPrice = sPrice;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsPrice() {
        return sPrice;
    }

    public void setsPrice(int sPrice) {
        this.sPrice = sPrice;
    }

    @PostConstruct
    public void start(){
        System.out.println("starting bean lifeCycle ......");
    }
    @PreDestroy
    public void end(){
        System.out.println("ending bean lifeCycle..........");
    }

    @Override
    public String toString() {
        return "Starters{" +
                "sName='" + sName + '\'' +
                ", sPrice=" + sPrice +
                '}';
    }
}
