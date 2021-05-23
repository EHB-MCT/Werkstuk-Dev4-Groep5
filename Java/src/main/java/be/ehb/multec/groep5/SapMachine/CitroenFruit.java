package be.ehb.multec.groep5.SapMachine;

public class CitroenFruit extends MainSap {

    @Override
    void WaterInvullen() {
        System.out.println("water aan de tank toevoegen");
    }

    @Override
    void suikerToevoegen() {
        System.out.println("indien nodig suiker toevoegen");
    }

    @Override
    void bruisWater() {
        System.out.println("voeg zo nodig bruiswater toe");
    }

}
