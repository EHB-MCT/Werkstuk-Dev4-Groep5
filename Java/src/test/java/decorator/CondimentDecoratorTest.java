package decorator;

import be.ehb.multec.groep5.Extra.Bruiswater;
import be.ehb.multec.groep5.Extra.GrootFormaat;
import be.ehb.multec.groep5.Extra.Suiker;
import be.ehb.multec.groep5.Fruitsap;
import be.ehb.multec.groep5.sap.Ananassap;
import be.ehb.multec.groep5.sap.Cocosap;

public class CondimentDecoratorTest {

    public static void creaFruitsap()
    {
        Fruitsap fruitsap = new Cocosap();

        fruitsap = new Bruiswater(fruitsap);
        fruitsap = new GrootFormaat(fruitsap);
        fruitsap = new Suiker(fruitsap);

        System.out.println(fruitsap.getFruitsapName() + " " + fruitsap.cost() + " €");
    }

    public static void main(String[] args)
    {
        creaFruitsap();
    }

}
