package org.springtutorial.removeXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("hot")
//@Scope("prototype")
public class Hotel {
    @Value("Taj")
    private String hName;
    @Value("Mumbai")
    private String hLocation;
    @Value("1000")
    private int hDist;

    @Autowired
    private HotelMenu hMenu;

    public Hotel() {
        super();
    }

    public Hotel(String hName, String hLocation, int hDist, HotelMenu hotelMenu) {
        this.hName = hName;
        this.hLocation = hLocation;
        this.hDist = hDist;
        this.hMenu= hotelMenu;
    }

    public HotelMenu gethMenu() {
        return hMenu;
    }

    public void sethMenu(HotelMenu hMenu) {
        this.hMenu = hMenu;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String gethLocation() {
        return hLocation;
    }

    public void sethLocation(String hLocation) {
        this.hLocation = hLocation;
    }

    public int gethDist() {
        return hDist;
    }

    public void sethDist(int hDist) {
        this.hDist = hDist;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hName='" + hName + '\'' +
                ", hLocation='" + hLocation + '\'' +
                ", hDist=" + hDist + '\''+
                ",hotelmenu=" + hMenu +
                '}';
    }
}
