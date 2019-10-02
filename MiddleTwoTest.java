package practice2;

import static org.junit.Assert.*;

import org.junit.Test;

// class java doc saying class to test and what class it is testing 
// java doc each test method 
// name tests something meaningful ie testsMiddleTwoWithString() and testsMiddleTwoWithNote()
public class MiddleTwoTest {
	
	/**
	 * testing whether or not the method for MIddle two works 
	 */

	@Test
	public final void testMain() {
		MiddleTwo middleTwo = new MiddleTwo(); 
		String result = middleTwo.middleTwo("String"); 
		assertEquals("ri", result);
	}

@Test
	public final void testMain1() {
		MiddleTwo middleTwo = new MiddleTwo(); 
		String result = middleTwo.middleTwo("Note"); 
		assertEquals("ot", result);
	}
}