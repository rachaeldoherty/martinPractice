package practice2;

import static org.junit.Assert.*;

import org.junit.Test;
//class java doc saying class to test and what class it is testing 
//java doc each test method 
//name tests something meaningful ie testsMiddleTwoWithString() and testsMiddleTwoWithNote()
public class PalandromeTest {

	/**
	 * test to see if the Palandrome method works
	 */
	
	 @Test public final void testIsPalindrome() { Palandrome isPalindrome = new
	 Palandrome(); Boolean result = isPalindrome.isPalindrome("rachael");
	 assertEquals(false, result);
	 
	 }
	 
	 @Test public final void testIsPalindrome1() { Palandrome isPalindrome = new
	 Palandrome(); Boolean result = isPalindrome.isPalindrome("xxooxx");
	 assertEquals(true, result); }
	
	
}
