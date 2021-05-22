package be.ehb.multec.groep5.Extra;

import be.ehb.multec.groep5.CondimentDecorator;
import be.ehb.multec.groep5.Fruitsap;

public class Formaat extends CondimentDecorator {

    public Formaat(Fruitsap fruitsap) {
        super(fruitsap);
        super.setFruitsapName(", formaat");
    }
    @Override
    protected double cost() {
        return super.cost() + 2.00;
    }


}
