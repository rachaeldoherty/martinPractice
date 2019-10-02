package practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public final void testMain() {
		Temperature temperature = new Temperature(); 
		Boolean result = temperature.icyHot(120, -1); 
		assertEquals(true, result);
	}

}
