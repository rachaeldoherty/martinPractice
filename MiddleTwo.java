/**
 * 
 */
package practice2;

// add java doc with info at start of class to say what this class does 
// if you have commented code out write a brief bit to say why is it to be deleted or are you coming back to it 
//
/**
 * @author DOH20170846
 *
 */
public class MiddleTwo {
	
	// say why these are commented out
 //MiddleTwo middleTwo = new MiddleTwo(); 
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		MiddleTwo middleTwo = new MiddleTwo(); 
//		System.out.println(middleTwo.middleTwo("String"));

//	}
	
	
	
// write a line at the top to say what it does ie...
	// my version 
	/**
	 * method to return the middle two letters of a string 
	 *  @param str
	 * @return middle two letters of an even string. 
	 */
/**
 * 
 * @param str
 * @return middle two letters of an even string. 
 */
	public String middleTwo(String str){
	
		int middleNum = str.length() / 2; 
		String bothHalf = str.substring(middleNum-1, middleNum+1); 

		return bothHalf;

		}
			
		
	}
	
	

