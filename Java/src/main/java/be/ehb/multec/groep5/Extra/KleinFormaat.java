package be.ehb.multec.groep5.Extra;

import be.ehb.multec.groep5.CondimentDecorator;
import be.ehb.multec.groep5.Fruitsap;

public class KleinFormaat extends CondimentDecorator {

    public KleinFormaat(Fruitsap fruitsap) {
        super(fruitsap);
        super.setFruitsapName("Klein Formaat");
    }

    protected int formaat(){

        return 250;
    }

    @Override
    public double cost() {
        return super.cost() + 1.00;
    }
}
