import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    public Visitor visitor1;
    public Visitor visitor2;
    public Visitor visitor3;
    public Visitor visitor4;


    @Before
    public void setUp() {
        visitor1 = new Visitor("John", 23, 200, 45);
        visitor2 = new Visitor("Jane", 23, 155, 25);
        visitor3 = new Visitor("Zippy", 11, 120, 20);
        visitor4 = new Visitor("George", 16, 130, 15);

    }

    @Test
    public void hasName() {
        assertEquals("John", visitor1.getName());
    }
    @Test
    public void hasAge() {
        assertEquals(23, visitor2.getAge(), 0.001);
    } @Test
    public void hasHeight() {
        assertEquals(120, visitor3.getHeight(), 0.001);
    } @Test
    public void hasMoney() {
        assertEquals(15, visitor4.getMoney(), 0.001);
    }

    @Test
    public void canChangeName() {
        visitor1.setName("Freddie");
        assertEquals("Freddie", visitor1.getName());
    }

    @Test
    public void canChangeAge() {
        visitor2.setAge(45);
        assertEquals(45, visitor2.getAge(), 0.001);
    }
    @Test
    public void canChangeHeight() {
        visitor3.setHeight(110);
        assertEquals(110, visitor3.getHeight(), 0.001);
    }
    @Test
    public void canChangeMoney() {
        visitor4.setMoney(50);
        assertEquals(50, visitor4.getMoney(), 0.001);
    }
}
