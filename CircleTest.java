package lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
  double EPSILON = 0.0001;
  @Test
  void testCircumference() {
    Circle c = new Circle(5.0, 0, 0);
    double expected = 2 * Math.PI * 5.0;
    double result = c.circumference(c.radius);
    assertEquals(expected, result, EPSILON);
  }
}
