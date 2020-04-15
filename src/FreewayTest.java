import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FreewayTest {

    public Freeway freeway;
    public Truck truck;
    @Before
    public void setUp() throws Exception {
        freeway = new Freeway();
        truck = new Truck(6.0);
    }

    @Test
    public void getOn() {
        freeway.getOn(truck);
        assertEquals(1, freeway.getRoad().size());

    }

    @Test
    public void getOff() {
        freeway.getOn(truck);
        freeway.getOff(truck);
        assertEquals(0, freeway.getRoad().size());
    }

    @Test
    public void move() {
        for (int i =0; i< 12 ; i++) {
            freeway.getOn(truck);
            try {
                freeway.move();
                if(i > 10){
                    fail("crash should have happened");
                }
            } catch (Crash crash) {
                //do nothing
            }
        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void testExit(){
        freeway.getOff(truck);
    }
}