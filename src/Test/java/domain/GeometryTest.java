package domain;

import org.example.Geometry;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometryTest {

    private static Geometry geometry;

    @BeforeAll
    public static void setUp(){
        System.out.println("This is executed before all tests");
        geometry = new Geometry();
    }

    @Test
    public void testAreaLengthIsThreeHeightIsFive(){
        int length = 3;
        int height = 5;

        int expectedValue = 15;
        int actualValue = geometry.area(length, height);
        assertEquals(expectedValue, actualValue, "The area method should return the area of the rectangle");
    }

    @Test
    public void testAreaLengthIsFiveHeightIsEight(){
        int length = 5;
        int height = 8;

        int expectedValue = 40;
        int actualValue = geometry.area(length, height);
        assertEquals(expectedValue, actualValue, "The area method should return the area of the rectangle");
    }

    @Test
    public void testAreaLengthIs2HeightIs4(){
        int length = 2;
        int height = 4;

        int expectedValue = 8;
        int actualValue = geometry.area(length, height);
        assertEquals(expectedValue, actualValue, "The area method should return the area of the rectangle");
    }

    @Test
    public void isTriangleShouldReturnTrueTest(){
        int a = 3;
        int b = 4;
        int c = 5;

        boolean expectedValue = true;
        boolean actualValue = geometry.isTriangle(a, b, c);
        assertEquals(expectedValue, actualValue, "The isTriangle method should return true if the three sides can form a triangle");
    }

    @Test
    public void isTriangleShouldReturnFalseTest(){
        int a = 7;
        int b = 13;
        int c = 5;

        boolean expectedValue = false;
        boolean actualValue = geometry.isTriangle(a, b, c);
        assertEquals(expectedValue, actualValue, "The isTriangle method should return true if the three sides can form a triangle");
    }
}
