package Singleton;

import be.ehb.multec.groep5.Menu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SingletonTest {


        @Test
        void getInstance() {
            Menu menu = Menu.getInstance();
            Menu anotherObject = Menu.getInstance();
            assertEquals(menu, anotherObject);
        }

        @Test
        void tryInstantiation() {
          // Menu menu = new Menu(); //impossible - compile time error
        }


}
