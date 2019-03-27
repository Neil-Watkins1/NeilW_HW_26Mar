import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp()  {
        dodgems = new Dodgems("Crazy Cars", 10, 130, 4);

    }

    @Test
    public void hasName() {
        assertEquals("Crazy Cars", dodgems.getName());
    }

    @Test
    public void hasMinAge() {
        assertEquals(10, dodgems.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(130, dodgems.getMinHeight());
    }

    @Test
    public void canChangeName() {
        dodgems.setName("Bumper Mania");
        assertEquals("Bumper Mania", dodgems.getName());
    }

    @Test
    public void canChangeMinHeight() {
        dodgems.setMinHeight(140);
        assertEquals(140, dodgems.getMinHeight());
    }

    @Test
    public void canChangeMinAge() {
        dodgems.setMinAge(12);
        assertEquals(12, dodgems.getMinAge());
    }
}
