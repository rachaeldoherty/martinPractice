package practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloNameDriverTest {

	@Test
	public final void test() {
		String result = HelloName.concatenate("Hello", "Bob"); 
		assertEquals("Hello Bob", result);
	}
	
	@Test
	public final void test1() {
		String result = HelloName.concatenate("Hello", "Alice"); 
		assertEquals("Hello Alice", result);
	}

	@Test
	public final void test2() {
		String result = HelloName.concatenate("Hello", "X"); 
		assertEquals("Hello X", result);
	}
	
}
