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
    public double cost() {
        return 1.05;
    }
}
