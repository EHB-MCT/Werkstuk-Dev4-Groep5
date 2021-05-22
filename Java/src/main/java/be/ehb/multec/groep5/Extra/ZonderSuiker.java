package be.ehb.multec.groep5.Extra;

import be.ehb.multec.groep5.CondimentDecorator;
import be.ehb.multec.groep5.Fruitsap;

public class ZonderSuiker extends CondimentDecorator {

    public ZonderSuiker(Fruitsap fruitsap) {
        super(fruitsap);
        super.setFruitsapName("Zonder Suiker");
    }

    @Override
    protected double cost(){
        return super.cost() + 0.00;
    }
}
