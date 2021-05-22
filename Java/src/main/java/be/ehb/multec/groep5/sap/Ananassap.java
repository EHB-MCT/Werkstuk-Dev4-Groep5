package be.ehb.multec.groep5.sap;

import be.ehb.multec.groep5.Fruitsap;

public class Ananassap extends Fruitsap {


    public Ananassap() {
        setFruitsapName("Ananassap");
    }

    @Override
    protected int formaat() {
        return 0;
    }

    @Override
    protected double cost() {
        return 2.50;
    }
}
