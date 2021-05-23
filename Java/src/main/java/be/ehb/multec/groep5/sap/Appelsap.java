package be.ehb.multec.groep5.sap;

import be.ehb.multec.groep5.Fruitsap;

public class Appelsap extends Fruitsap {

    public Appelsap() {
        setFruitsapName("Appelsap");
    }

    protected int formaat() {
        return 0;
    }

    @Override
    protected double cost() {
        return .50;
    }
}
