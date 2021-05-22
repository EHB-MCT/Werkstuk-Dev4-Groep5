package be.ehb.multec.groep5;

public class Cocosap extends Fruitsap{

    public Cocosap() {
        setFruitsapName("CocoSap");
    }

    /*protected String naam(){
        return "coco";
    }*/

    @Override
    protected boolean bruisend() {
        return false;
    }

    @Override
    protected boolean suiker() {
        return false;
    }

    @Override
    protected double formaat() {
        return 200;
    }

    @Override
    protected double cost() {
        return 1.25;
    }
}
