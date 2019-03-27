import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Rita", 14, 145, 180, 4);

    }

    @Test
    public void hasName() {
        assertEquals("Rita", rollerCoaster.getName());
    }

    @Test
    public void canChangeName() {
        rollerCoaster.setName("The Smiler");
        assertEquals("The Smiler", rollerCoaster.getName());
    }

    @Test
    public void hasMinAge() {
        assertEquals(14, rollerCoaster.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(145, rollerCoaster.getMinHeight());
    }

    @Test
    public void canChangeMinHeight() {
        rollerCoaster.setMinHeight(150);
        assertEquals(150, rollerCoaster.getMinHeight());
    }

    @Test
    public void canChangeMinAge() {
        rollerCoaster.setMinAge(15);
        assertEquals(15, rollerCoaster.getMinAge());
    }

    @Test
    public void canGetRating() {
        assertEquals(4, rollerCoaster.getRating());
    }
}

