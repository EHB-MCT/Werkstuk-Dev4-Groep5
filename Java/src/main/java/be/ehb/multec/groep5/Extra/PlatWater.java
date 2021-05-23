package be.ehb.multec.groep5.Extra;

import be.ehb.multec.groep5.CondimentDecorator;
import be.ehb.multec.groep5.Fruitsap;

public class PlatWater extends CondimentDecorator {

    public PlatWater(Fruitsap fruitsap) {
        super(fruitsap);
        super.setFruitsapName("Plat Water");
    }

    @Override
    public double cost(){
        return super.cost() + 0.20;
    }

}
