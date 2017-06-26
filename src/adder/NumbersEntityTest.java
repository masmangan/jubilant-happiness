package adder;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersEntityTest {

	@Test
	public void testGetResultWhenNumbersAreNotSet() {
		NumbersEntity ne = new NumbersEntity();
		int expected = 0;
		int actual = ne.getResult();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetResultWhenOnlyFirstNumberIsSet() {
		NumbersEntity ne = new NumbersEntity();
		ne.setFirstNumber(10);
		int expected = 10;
		int actual = ne.getResult();
		assertEquals(expected, actual);
	}
	
}
