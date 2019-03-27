import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

public IceCreamStall iceCreamStall;

    @Before
    public void setUp() {

        iceCreamStall = new IceCreamStall("Fluffy Peaks", "Mr Whippy", 23, 3);

    }

    @Test
    public void hasName() {
        assertEquals("Fluffy Peaks", iceCreamStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Mr Whippy", iceCreamStall.getOwner());
    }

    @Test
    public void hasParkingSpace() {
        assertEquals(23, iceCreamStall.getParkingSpace());

    }

    @Test
    public void canChangeName() {
        iceCreamStall.setName("Snowy Slopes");
        assertEquals("Snowy Slopes", iceCreamStall.getName());
    }

    @Test
    public void canChangeOwner() {
        iceCreamStall.setOwner("Frigid Fiona");
        assertEquals("Frigid Fiona", iceCreamStall.getOwner());
    }

    @Test
    public void canChangeParkingSpace() {
        iceCreamStall.setParkingSpace(10);
        assertEquals(10, iceCreamStall.getParkingSpace());
    }
}


