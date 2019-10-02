package practice2;

import static org.junit.Assert.*;

import org.junit.Test;
//class java doc saying class to test and what class it is testing 
//java doc each test method 
//name tests something meaningful ie testsMiddleTwoWithString() and testsMiddleTwoWithNote()
public class SeeColourTest {

	
	/**
	 * testing weather or not the SeeColour Method works
	 */
	@Test
	public final void test() {
			SeeColour seeColour = new SeeColour();
			String result = seeColour.seeColour("redxxx"); 
			assertEquals("red", result); 
	}
	
	
	@Test
	public final void test1() {
		SeeColour seeColour = new SeeColour();
		String result1 = seeColour.seeColour("blueTimes"); 
		assertEquals("blue", result1); 
		
	}
	
	@Test
	public final void test2() {
		SeeColour seeColour = new SeeColour();
		String result2 = seeColour.seeColour("xxred"); 
		assertEquals("", result2); 
	}

}
