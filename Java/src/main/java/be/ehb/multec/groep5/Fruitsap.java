package be.ehb.multec.groep5;

public abstract class Fruitsap {

    protected String fruitsapName;

    protected void setFruitsapName(String fruitsapName) {
        this.fruitsapName = fruitsapName;
    }

    protected String getFruitsapName() {
        return fruitsapName;
    }

    protected abstract int formaat();

    protected abstract double cost();

}
