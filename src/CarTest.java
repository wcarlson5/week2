import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    public Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void testStart() {
        assertTrue(car.start());
    }
    @Test
    public void testStart2() {
        car.start();
        assertFalse(car.start());
    }

    @Test
    public void testStart3() {
        car.start();
        car.stop();
        assertTrue(car.start());
    }

    @Test
    public void testStop(){
        assertFalse(car.stop());
    }

    @Test
    public void testStop2(){
        car.start();
        assertTrue(car.stop());
    }

}