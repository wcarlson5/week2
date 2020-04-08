import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SedanTest {
    public Sedan sedan;
    @Before
    public void setUp() throws Exception {
        sedan = new Sedan(4);
    }

    @Test
    public void testGetDoors() {
        assertEquals(4, sedan.getDoors());
    }
}