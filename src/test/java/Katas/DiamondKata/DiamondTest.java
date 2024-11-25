package Katas.DiamondKata;

import org.junit.jupiter.api.Test;

import static Katas.DiamondKata.Diamond.printDiamond;
import static org.junit.jupiter.api.Assertions.*;

class DiamondTest {

    @Test
    void printDiamondTestNullResult() {
        String resultOne = printDiamond(0);
        String resultTwo = printDiamond(2);
        String resultThree = printDiamond(-5);

        assertNull(resultOne);
        assertNull(resultTwo);
        assertNull(resultThree);
    }
    @Test
    void printDiamondTest() {
        String resultOne = printDiamond(1);
        String resultTwo = printDiamond(3);
        String resultThree = printDiamond(5);

        String expectedOne = "*\n";
        String expectedTwo = " *\n***\n *\n";
        String expectedThree = "  *\n ***\n*****\n ***\n  *\n";

        assertEquals(expectedOne, resultOne);
        assertEquals(expectedTwo, resultTwo);
        assertEquals(expectedThree, resultThree);
    }
}