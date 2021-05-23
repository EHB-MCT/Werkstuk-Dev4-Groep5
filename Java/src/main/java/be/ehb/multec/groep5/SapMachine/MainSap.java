package be.ehb.multec.groep5.SapMachine;

public abstract class MainSap {

    abstract void WaterInvullen();
    abstract void suikerToevoegen();
    abstract void bruisWater();

    //template method
    public final void start(){

        //Water WaterInvullen
        WaterInvullen();

        //suiker
        suikerToevoegen();

        //bruis Water
        bruisWater();
    }
.
}
