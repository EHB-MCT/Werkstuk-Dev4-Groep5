package be.ehb.multec.groep5.Extra;

import be.ehb.multec.groep5.CondimentDecorator;
import be.ehb.multec.groep5.Fruitsap;

public class Suiker extends CondimentDecorator {

    public Suiker(Fruitsap fruitsap) {
        super(fruitsap);
        super.setFruitsapName("met Suiker");
    }

    @Override
    protected double cost(){
        return super.cost() + 0.10;
    }




}
