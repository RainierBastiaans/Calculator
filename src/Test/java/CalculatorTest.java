import org.example.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUp(){
        System.out.println("This is executed before all tests");
        calculator = new Calculator();
    }

    @Test
    public void testSum(){

        int a = 2;
        int b = 3;

        int expectedValue = a+b;
        int actualValue = calculator.sum(a, b);
        assertEquals(expectedValue, actualValue, "The sum method should return the sum of the two numbers");
    }
}