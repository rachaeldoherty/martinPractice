package practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTestTest {

	@Test
	public final void testTestConcatenate() {
		MyUnit myUnit = new MyUnit(); 
		String result = myUnit.concatenate("three",  "four"); 
		
		assertEquals("threefour", result); 
	}

}
