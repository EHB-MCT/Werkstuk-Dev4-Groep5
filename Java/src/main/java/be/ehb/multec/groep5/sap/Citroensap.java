package be.ehb.multec.groep5.sap;

import be.ehb.multec.groep5.Fruitsap;

public class Citroensap extends Fruitsap {

    public Citroensap() {
        setFruitsapName("Citroensap");
    }


    protected int formaat() {
        return 0;
    }

    @Override
    protected double cost() {
        return 2.05;
    }
}
