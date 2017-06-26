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
	
	@Test
	public void testGetResultWhenFirstNumberIsMAX_VALUE() {
		NumbersEntity ne = new NumbersEntity();
		ne.setFirstNumber(Integer.MAX_VALUE);
		int expected = Integer.MAX_VALUE;
		int actual = ne.getResult();
		assertEquals(expected, actual);
	}	
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetResultWhenFirstNumberIsMAX_VALUEAndSecondIsOne() {
		NumbersEntity ne = new NumbersEntity();
		ne.setFirstNumber(Integer.MAX_VALUE);
		ne.setSecondNumber(1);
		int expected = Integer.MAX_VALUE + 1 ;
		int actual = ne.getResult();
		assertEquals(expected, actual);
		assertTrue(Integer.MAX_VALUE + 1 > Integer.MAX_VALUE);
		// TODO: write OCL for this!
	}	
}






