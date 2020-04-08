import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TruckTest {
    public Truck truck;
    @Before
    public void setUp() throws Exception {
        truck = new Truck(6.3);
    }

    @Test
    public void testGetBedLength() {
        assertEquals(6.3, truck.getBedLength());
    }
}