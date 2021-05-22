package be.ehb.multec.groep5.Extra;

import be.ehb.multec.groep5.CondimentDecorator;
import be.ehb.multec.groep5.Fruitsap;

public class GrootFormaat extends CondimentDecorator {

    public GrootFormaat(Fruitsap fruitsap) {
        super(fruitsap);
        super.setFruitsapName("Groot Formaat");
    }

    protected int formaat(){
        return 550;
    }

    @Override
    protected double cost() {
        return super.cost() + 2.00;
    }


}
