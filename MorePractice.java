package practice2;

import java.util.ArrayList;

public class MorePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MorePractice morePractice = new MorePractice(); //creating an instance of the class
		
		/**
		 * creating the return call for PRACTICE 1
		 */
		morePractice.returnSomthing();
		boolean outcome = morePractice.returnSomthing();
		System.out.println("the outcome was: "+ outcome);
		/**
		 * creating the return call for PRACTICE 2
		 */
		morePractice.returnInt();
		int outcome2 = morePractice.returnInt(); 
		System.out.println("the int in the method returnInt is equal to: " + outcome2);
		
		/**
		 * creating the return call for PRACTICE 3
		 */
		morePractice.returnString();
		String outcome3 = morePractice.returnString();
		System.out.println(outcome3);
		
		/**
		 * creating the return call for PRACTICE 4
		 */
		morePractice.returnMultipleInt();
		int outcome4 = morePractice.returnMultipleInt();
		System.out.println(outcome4);
		
		/**
		 * creating the return call for PRACTICE 5
		 */
		ArrayList<String> string3 = new ArrayList<String>();
		string3.addAll(morePractice.returnArrayList());
		for (String string : string3) {
			System.out.print(string);
			System.out.print(" ");
		}
	}
//PRACTICE 1
	//creating a method of the instance of the class. as we are RETURNING a BOOL, it has to be a boolean in the TYPE in the title of the method
	// state in the method title if public or private, the variable, and then the name. 
	private boolean returnSomthing() {
		boolean result = false; //stating the the boolean is false, 
								//boolean = variable, result = variable name, =false is what the variable equals to
		return result; 			//returning the variable name result
	}
//PRACTICE 2
	private int returnInt() {
		int result = 42;
		return result;
		
	}

//PRACTICE 3
	private String returnString() {
		String result = "hello world!";
		return result; 
		
	}
//Practice 4
	private int returnMultipleInt() {
		int a = 4; 
		int b = 5; 
		int result = (a*b); 
		return result; 
	
	}
	
//Practice 5
	private ArrayList<String> returnArrayList() {
 		ArrayList<String> string3 = new ArrayList<String>(); //to make a new instance you take the 
 		//method name, provide it a variable name ='s to new instance of the method name.
		string3.add("Hello"); 
		string3.add("World");		
		return string3;		
		//string3.add("here"); you can not return AFTER a return statement! only one return can happen and what you need to return MUST be above the statement. 

	}
	

	}

