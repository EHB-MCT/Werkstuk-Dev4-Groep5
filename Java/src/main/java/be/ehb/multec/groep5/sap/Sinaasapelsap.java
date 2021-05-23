package be.ehb.multec.groep5.sap;

import be.ehb.multec.groep5.Fruitsap;

public class Sinaasapelsap extends Fruitsap {


    public Sinaasapelsap() {
        setFruitsapName("Sinaasapelsap");
    }

    protected int formaat() {
        return 0;
    }

    @Override
    protected double cost() {
        return 0.50;
    }
}
