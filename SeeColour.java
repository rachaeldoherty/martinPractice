package practice2;
//add  info at start of class to say what this class does 
//if you have commented code out write a brief bit to say why is it to be deleted or are you coming back to it 
//
/**
 * 
 * @author DOH20170846
 *
 */
public class SeeColour {
	/**
	 * 
	 * @param str
	 * @return nothing, red or blue depending on what is in the string 
	 */
	public String seeColour(String str) {
		String colour = "";

		if ((str.startsWith("red"))) {
			colour = "red";
			
		} else if (str.startsWith("blue")) {
			colour = "blue";

		} else {
			colour = "";
		}
		return colour;

	}
}
