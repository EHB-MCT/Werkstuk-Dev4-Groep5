package be.ehb.multec.groep5;

public abstract class Fruitsap {

    protected String fruitsapName;

    protected void setFruitsapName(String fruitsapName) {
        this.fruitsapName = fruitsapName;
    }

    public String getFruitsapName() {
        return fruitsapName;
    }

    protected abstract int formaat();

    public abstract double cost();

}
