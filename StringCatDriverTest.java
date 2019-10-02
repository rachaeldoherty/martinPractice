package practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCatDriverTest {

	@Test
	public final void test() {
		String result = StringCat.concatenate("Hello", "Rachael"); //static methods means you do not need to have an "instance of"
		assertEquals("Hello Rachael", result); 
	}
	@Test
	public final void test1() {
		String result = StringCat.concatenate("Hello", "Michael"); 
		assertEquals("Hello Michael", result); 
}
	@Test
	public final void test2() {
		String result = StringCat.concatenate("Hello", "Gabrielle"); 
		assertEquals("Hello Gabrielle", result); 
}
	
	
	
}