import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
	Fibonacci object = new Fibonacci();
	@DisplayName("This is anagram checker test")
	@Test
	public void fibonacciSeriesTestZero() {
	int expected = 0;
		 Assertions.assertSame(expected, object.fibRecursion(0));
	}
	@Test
	public void fibonacciSeriesTestOne() {
	int expected = 1;
		 Assertions.assertSame(expected, object.fibRecursion(1));
	}
	@Test
	public void fibonacciSeriesTest() {
	int expected = 21;
		 Assertions.assertSame(expected, object.fibRecursion(8));
//Try any test condition here
	}
}
