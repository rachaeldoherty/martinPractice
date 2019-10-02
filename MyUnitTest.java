package practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public final void testConcatenate1() {
		MyUnit myUnit = new MyUnit(); 
		String result = myUnit.concatenate("one", "two"); 
		assertEquals("onetwo",result);
	}

	@Test
	public final void testConcatenate2() {
		MyUnit myUnit = new MyUnit(); 
		String result = myUnit.concatenate("three",  "four"); 
		
		assertEquals("threefour", result); 
	}
	@Test
	public final void testConcatenate3() {
		MyUnit myUnit = new MyUnit(); 
		String result = myUnit.concatenate("eight", "nine"); 
	
		assertNotEquals("onetwo", result);
}
	
	
}
