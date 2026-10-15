package edu.bsu.cs;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class SillyMethodsTest {

    @Test
    public void testDidGuess42Correctly() {
        SillyMethods sillyMethods = new SillyMethods();
        Assertions.assertTrue(sillyMethods.didGuess42(42));
    }

    @Test
    public void testDidGuess42Incorrectly() {
        SillyMethods sillyMethods = new SillyMethods();
        Assertions.assertFalse(sillyMethods.didGuess42(17));
    }

    @Test
    public void testCountTo10() {
        SillyMethods sillyMethods = new SillyMethods();
        Assertions.assertEquals(
                "0 1 2 3 4 5 6 7 8 9 10",
                sillyMethods.countTo(10)
        );
    }

    @Test
    public void testCountTo15() {
        SillyMethods sillyMethods = new SillyMethods();
        Assertions.assertEquals(
                "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15",
                sillyMethods.countTo(15)
        );
    }
}
