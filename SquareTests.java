package lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * UnitTests for the Square class
 */
class SquareTests {
    double EPSILON = 0.0001;

    @Test
    void testCalculateArea() {
        Square s = new Square(new Point(0, 0), 5);
        assertTrue(s.area() - 25 < EPSILON);
    }

    @Test
    void testSquarePerimeter(){
        Square s = new Square(new Point(0, 0), 10);
        assertTrue(s.perimeter() - 40 < EPSILON);
    }

    @Test
    void testSquareEqualsItself(){
        Square s = new Square(new Point(0, 0), 1);
        assertEquals(s, s);
    }

    @Test
    void testSquareDoesNotEqualNull(){
        Square s = new Square(new Point(0, 0), 5);
        assertNotEquals(s, null);
    }

    @Test
    void testNullDoesNotEqualSquare(){
        Square s = new Square(new Point(0, 0), 5);
        assertNotEquals(null, s);
    }

    @Test
    void testSquareDoesNotEqualsTriangle(){
        Point p = new Point(1,1);
        Triangle t = new Triangle(p, p, p);
        Square s = new Square(p,10);
        assertNotEquals(s, t);
    }

    @Test
    void testSquareEqualsAnotherSquareSameLengthTrue(){
        Square s1 = new Square(new Point(0, 0), 10);
        Square s2 = new Square(new Point(0, 0), 10);
        assertEquals(s1, s2);
    }

    @Test
    void testSquareDoesNotEqualAnotherSquareDifferentLength(){
        Square s1 = new Square(new Point(0, 0), 5);
        Square s2 = new Square(new Point(0, 0), 10);
        assertNotEquals(s1, s2);
    }

    @Test
    void testSquareHashCode(){
        Square s1 = new Square(new Point(0, 0), 5);
        Square s2 = new Square(new Point(0, 0), 5);
        assertEquals(s1.hashCode(), s2.hashCode());
    }
}