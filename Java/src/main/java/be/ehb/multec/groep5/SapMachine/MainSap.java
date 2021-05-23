package be.ehb.multec.groep5.SapMachine;

public abstract class MainSap {

    //template method
    public final void start(String suiker,String bruis){

        //Water WaterInvullen
        waterInvullen();
        //suiker
        suikerToevoegen(suiker);
        //bruis Water
        bruisWater(bruis);
        //fruit mixen
        fruitVoorbereiden();
   }

    abstract void fruitVoorbereiden();

        //Water WaterInvullen
    public void waterInvullen() {
        System.out.println("--------------------------------------");

        System.out.println("water aan de tank toevoegen");
    }

    //suiker
    public void suikerToevoegen(String suiker) {

        if(suiker == "met Suiker") {

            System.out.println("suiker toevoegen");

        }else {

            System.out.println("geen suiker toevoegen");

        }
    }

    //bruis Water
        public void bruisWater(String bruis) {
            if(bruis == "bruiswater"){

            System.out.println("co2 cilinder voorbereiden" +
                    "Bubbels toevoegen aan water");

            }else{

                System.out.println("gewoon plat water gebruiken");

            }
        }

    
}
