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
    public double cost() {
        return 1.25;
    }
}
