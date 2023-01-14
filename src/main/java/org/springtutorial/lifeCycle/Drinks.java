package org.springtutorial.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drinks implements InitializingBean, DisposableBean {
    private String dName;
    private int dPrice;

    public Drinks(String dName, int dPrice) {
        this.dName = dName;
        this.dPrice = dPrice;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getdPrice() {
        return dPrice;
    }

    public void setdPrice(int dPrice) {
        this.dPrice = dPrice;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "dName='" + dName + '\'' +
                ", dPrice=" + dPrice +
                '}';
    }

    public void destroy() throws Exception {
        System.out.println("bean has been destroyed .....");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside the Initializing beans , init method has invoked");
    }
}
