package domain;

import org.example.Digit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DigitTest {
    private static Digit digit;
    private static int number = 123456789;

    @BeforeAll
    public static void setUp(){
        System.out.println("This is executed before all tests");
        digit = new Digit(number);
    }

    @Test
    public void testAmountOfDigits(){
        int expectedValue = 9;
        int actualValue = digit.amountOfDigits();
        assertEquals(expectedValue, actualValue, "The amountDigits method should return the amount of digits in the number");
    }

    @Test
    public void testAverageOfDigits(){
        int expectedValue = 5;
        int actualValue = digit.averageAmount();
        assertEquals(expectedValue, actualValue, "The averageAmount method should return the average of the digits in the number");
    }
}
