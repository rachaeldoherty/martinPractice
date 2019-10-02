package practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class hasBadTest {

	@Test
	public final void testHasBad() {
		hasBad hasBad = new hasBad(); 
		boolean result = hasBad.hasBad("badxx"); 
		assertEquals(true, result); 
	}
	
	@Test
	public final void testHasBad1() {
		hasBad hasBad = new hasBad(); 
		boolean result = hasBad.hasBad("xbadxx"); 
		assertEquals(true, result); 

}
	@Test
	public final void testHasBad2() {
		hasBad hasBad = new hasBad(); 
		boolean result = hasBad.hasBad("xxbadxx"); 
		assertEquals(false, result); 
	
	
}
}
