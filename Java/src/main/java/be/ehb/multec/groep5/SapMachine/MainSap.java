package be.ehb.multec.groep5.SapMachine;

public abstract class MainSap {

    //template method
   final void start(){
       //fruit mixen
       fruitVoorbereiden();
        //Water WaterInvullen
        waterInvullen();
        //suiker
        suikerToevoegen();
        //bruis Water
        bruisWater();   
   } 
   
    abstract void fruitVoorbereiden();
    
        //Water WaterInvullen
    public void waterInvullen() {
        System.out.println("water aan de tank toevoegen");
    }
    //suiker
    public void suikerToevoegen() {
        System.out.println("indien nodig suiker toevoegen");
    }
    //bruis Water
    public void bruisWater() {
        System.out.println("voeg zo nodig bruiswater toe");
    }
    
}
