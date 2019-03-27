import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    public TobaccoStall tobaccoStall;
    public Visitor visitor1;
    public Visitor visitor2;
    public Visitor visitor3;
    public Visitor visitor4;

    @Before
    public void setUp() {

        tobaccoStall = new TobaccoStall("Smokey Joes", "Mr Butler", 666, 5);
        visitor1 = new Visitor("John", 23, 200, 45);
        visitor2 = new Visitor("Jane", 23, 155, 25);
        visitor3 = new Visitor("Zippy", 11, 120, 20);
        visitor4 = new Visitor("George", 16, 130, 15);

    }

    @Test
    public void hasName() {
        assertEquals("Smokey Joes", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Mr Butler", tobaccoStall.getOwner());
    }

    @Test
    public void hasParkingSpace() {
        assertEquals(666, tobaccoStall.getParkingSpace());
    }

    @Test
    public void canChangeName() {
        tobaccoStall.setName("Fags are Us");
        assertEquals("Fags are Us", tobaccoStall.getName());
    }

    @Test
    public void canChangeOwner() {
        tobaccoStall.setOwner("Mr Lambert");
        assertEquals("Mr Lambert", tobaccoStall.getOwner());
    }

    @Test
    public void canChangeParkingSpace() {
        tobaccoStall.setParkingSpace(777);
        assertEquals(777, tobaccoStall.getParkingSpace());
    }

    @Test
    public void visitorIsAllowed() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void visitorIsNotAllowedTo() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor3));
    }

    @Test
    public void canGetRating() {
        assertEquals(5, tobaccoStall.getRating());
    }
}
