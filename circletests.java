package lab5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTests {
	
	@Test
	void t1() {
		double r = 1;
		int x = 0;
		int y = 0;
		Circle circle = new Circle(r, x, y);
		assertNotEquals(circle, null);
	}

	@Test
	void t2() {
		double r = 2;
		int x = 1;
		int y = 1;
		Circle circle = new Circle(r, x, y);
		assertEquals(true, circle.openset(2, 2));
	}
	
	@Test
	void t3() {
		double r = 10;
		int x = 0;
		int y = 0;
		Circle circle = new Circle(r, x, y);
		assertEquals(false, circle.openset(10, 11));
	}
	
	
	
}