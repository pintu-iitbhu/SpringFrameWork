package org.springtutorial.removeXML;

import org.springframework.beans.factory.annotation.Value;

public class HotelMenu {
    @Value("Panir lababdar")
    private String panir;
    @Value("Chiken Tikka")
    private String chicken;

    @Value("VerginMohito")
    private String drinks;

    public HotelMenu() {
        super();
    }

    public HotelMenu(String panir, String chicken, String drinks) {
        this.panir = panir;
        this.chicken = chicken;
        this.drinks = drinks;
    }

    public String getPanir() {
        return panir;
    }

    public void setPanir(String panir) {
        this.panir = panir;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "HotelMenu{" +
                "panir='" + panir + '\'' +
                ", chicken='" + chicken + '\'' +
                ", drinks='" + drinks + '\'' +
                '}';
    }
}
