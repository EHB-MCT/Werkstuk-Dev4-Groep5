package be.ehb.multec.groep5.sap;

import be.ehb.multec.groep5.Fruitsap;

public class Perziksap extends Fruitsap {


    public Perziksap() {
        setFruitsapName("Perziksap");
    }


    protected int formaat() {
        return 0;
    }

    @Override
    protected double cost() {
        return 1.00;
    }
}
