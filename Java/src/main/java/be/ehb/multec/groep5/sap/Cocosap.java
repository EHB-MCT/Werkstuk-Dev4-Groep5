package be.ehb.multec.groep5.sap;

import be.ehb.multec.groep5.Fruitsap;

public class Cocosap extends Fruitsap {

    public Cocosap() {
        setFruitsapName("CocoSap");
    }

    protected int formaat() {
        return 0;
    }


    @Override
    protected double cost() {
        return 0.80;
    }
}
