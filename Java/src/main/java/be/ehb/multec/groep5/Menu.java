package be.ehb.multec.groep5;

import java.util.ArrayList;

public class Menu {

    public String bestelling;
    public String fruitsapName;
    public String suiker;
    public String water;
    public int formaat;
    public double prijs;

private static Menu menuInstance = new Menu();

    private Menu(){}
    public static Menu getInstance()
    {
        return menuInstance;
    }

    public String getBestelling() {
        return bestelling;
    }

    public void setBestelling(String bestelling) {
        this.bestelling = bestelling;
    }

    public String getFruitsapName() {
        return fruitsapName;
    }

    public void setFruitsapName(String fruitsapName) {
        this.fruitsapName = fruitsapName;
    }

    public String getSuiker() {
        return suiker;
    }

    public void setSuiker(String suiker) {
        this.suiker = suiker;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public int getFormaat() {
        return formaat;
    }

    public void setFormaat(int formaat) {
        this.formaat = formaat;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
}
