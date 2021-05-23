package be.ehb.multec.groep5.Extra;

import be.ehb.multec.groep5.CondimentDecorator;
import be.ehb.multec.groep5.Fruitsap;

public class Bruiswater extends CondimentDecorator {

    public Bruiswater(Fruitsap fruitsap) {
        super(fruitsap);
        super.setFruitsapName(" bruiswater");
    }
    @Override
    protected double cost() {
        return super.cost() + 0.10;
    }


}
