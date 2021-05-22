package be.ehb.multec.groep5;

public abstract class CondimentDecorator extends Fruitsap {
    protected Fruitsap fruitsap;

    protected CondimentDecorator(Fruitsap fruitsap) {
        this.fruitsap = fruitsap;
    }

    protected int formaat(){ return fruitsap.formaat();}

    protected double cost() {
        return fruitsap.cost();
    }
}
