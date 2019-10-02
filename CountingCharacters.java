package practice2;
//java docs 
// the at param annotation is for the arguments inside the brackets of a method not the comment/ description of the method 
// remember to fill in the return statements 
//you don't need to instantiate a new instance of the class for every method
//consider creating individual test methods for each class and just call those once in the main
public class CountingCharacters {
	
	

	public static void main(String[] args) {
		// you don't need to instantiate a new instance of the class for every method
		CountingCharacters countingCharacters = new CountingCharacters();
		
		//System.out.println(countingCharacters.countingCharacters("XXX"));  
		//System.out.println(countingCharacters.countingCharacters("AAAAA")); 		
		//System.out.println(countingCharacters.countingCharacters("ZADFHZDFH")); 
		
		CountingCharacters everyNth = new CountingCharacters();
		System.out.println(countingCharacters.everyNth("Rachael",1)); 	//returns Rachael 
		System.out.println(countingCharacters.everyNth("Ross",2)); 		//returns Rs
		System.out.println(countingCharacters.everyNth("Joey",3)); 		//returns Jy
		System.out.println(countingCharacters.everyNth("Phoebe",4));	//returns Pb
		System.out.println(countingCharacters.everyNth("Monica",5));	//returns Ma
		System.out.println(countingCharacters.everyNth("Chandler",6)); 	//returns Ce
		
		//CountingCharacters  fizzBuzz = new CountingCharacters();
		System.out.println(countingCharacters.fizzBuzz(2,10)); 	//
	}
	
	//how i would suggest to write your java doc 
	/**
	 *  method to count the length of string is provided.
	 * @param String str1, int N
	 * @return  mynewString
	 */
	
/**
 * 
 * @param creating a method to count the length of whatever string is provided.
 * @return
 */
	
	
//	public int countingCharacters(String str1) {
//		int length = str1.length(); 
//		return length;
//	}
	
	public String everyNth(String str1, int N) {
		String mynewString = new String(); 
		
		
		for (int index=0; index<str1.length();index +=N)
		{
			mynewString += str1.charAt(index);
			
		}
		
		return mynewString;
		
		
	
	}
	// java doc 
	public String frontTimes(String str, int n) {
		  String str1 = ""; 
		  int i = 0; 
		  
		  if (n<=3); 
		  for (i = 0; i<=n; i++); 
		  return str; 
		}

	/**
	 * 
	 * @param start will be the starting number 
	 * @param end will be the end number 
	 * @returning number(if !n/ by 3,5 or15), Fizz( if n/3=0), Buzz( if n/5=0) or FizzBuzz( if n/15=0)
	 */

	public String[] fizzBuzz(int start, int end) {
		   String[] result = new String[end-start];//have to specify the size of it; hence end-start

		  for (int index = 0; index < result.length; index++){
		    
		   if(start%15==0){ 
		    result[index] = "FizzBuz"
		    		+ "{";
		   }
		  
		  else if (start%5==0){
		    result[index] = "Buzz";
		  }
		   else if (start%3==0){
		    result[index] = "Fizz";
		  }
		   else{
		     result[index] = String.valueOf(start);
		   }
		   start++;
		} return result; 
		
		}

	public int arrayCount9(int[] nums) {
		  int count = 0; 
		  for (int index = 0; index <= nums.length; index++){
		  if (nums[index] == 9)
		  {
		    count++;
		 } 

		} 
		return count; 
		}
}
