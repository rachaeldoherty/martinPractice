package practice2;

public class Palandrome {
	
	// java doc class 
	// add brief explaination to each method statement java doc 
	//be careful with formatting 
	
	public static void main(String[] args)
	{
		System.out.println(stringBits("code"));
	}

	/**
	 * 
	 * @param number
	 * @returning what century a year is in.
	 */
	public static int century(int number) {
		int century;

		if (number % 100 == 0) {
			century = number / 100;

		}

		else {
			century = number / 100 + 1;
		}
		return century;
	}
	
	// formatting- too far out
	/**
	* 
	* @param str
	* @return true if the string contains an xo within it. 
	*/
	 public static boolean getXO (String str) {
		 if (str.contains("xo")){
		   return true; 
		    }else return false; 
			  } 
			


	  /**
	 * creating a while loop to compare characters against each other 
	 * @param str
	 * @return boolean true = palandrome (I can't spell, apologies)
	 */
	public boolean isPalindrome(String str) {
		boolean result = false;
		//&& if written boolean result = true; 
		int length = str.length(); 
		int forward = 0; 
		int backward = length-1; //as length will return x, index position will be x-1
		
		
		while(forward < backward) { // forward must be smaller than backwards to go into the while loop
			char forwardChar = str.charAt(forward++); //character position 0, character position 1 etc. 
			char backwardChar = str.charAt(backward--); //character position length -1 , character position length -2 etc.  
			if (forwardChar == backwardChar) { //as we have declared result to be false above, front char must == back char to be true 
				//&& this to be written as if (forwardChar!= backwardChar) 
				result = true;
				//&& result = false
			break; 
			}
		}
	return result; 
	}

	// formatting     
	/**
	 *   
	 * @param str 
	 * @returning Given a non-empty string like "Code" return a string like "CCoCodCode".
	 */
	public static String stringBits(String str) 
	{
		String result = "";
		
		for(int index = 0; index < str.length(); index++)
		  {
		    result = result + str.substring(0, index + 1);
		
		  }
		  return result;
	}



}