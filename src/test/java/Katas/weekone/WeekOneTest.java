package Katas.weekone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekOneTest {

    @Test
    public void testExampleFromDescription() {
        assertEquals(WeekOne.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
    }
}