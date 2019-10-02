package practice2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayExamples arrayExamples = new ArrayExamples();
//		arrayExamples.addStringToArrayList();
//		ArrayList<String> outcome = arrayExamples.addStringToArrayList();
//		for(int index = 0; index <outcome.size(); index++){
//			String indexValue = outcome.get(index); 
//			System.out.print(indexValue);		}
		ArrayExamples arrayExamples = new ArrayExamples();
//		arrayExamples.listOfAnimals2();
//		arrayExamples.listOfAnimals3();
		arrayExamples.listOfAnimals4();

	}

//	public ArrayList<String> addStringToArrayList() {
//		ArrayList<String> listOfStuff = new ArrayList<String>(); 
//		listOfStuff.add("Good");
//		listOfStuff.add("Morning");
//		listOfStuff.add("Everyone");

	// System.out.println("size of this array list is: " + listOfStuff.size());
	// System.out.println(listOfStuff.contains("Good")); //contains = turns it into
	// a boolean (returns true or false)

	// for(int index = 0; index <listOfStuff.size(); index++){
	// String indexValue = listOfStuff.get(index);
	// System.out.println("Value of string: "+indexValue);//returns the value of the
	// first string, the second string, right the way through the array
	// }

	// return listOfStuff;

	// }
	public ArrayList<String> listOfAnimals() {
		ArrayList<String> listOfAnimals = new ArrayList<String>();
		listOfAnimals.add("Elephant");
		listOfAnimals.add("Rhino");
		listOfAnimals.add("Lion");
		// Iterator itr = listOfAnimals.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			}
		return listOfAnimals;
	}

	public ArrayList<String> listOfAnimals2() {
		ArrayExamples arrayExamples = new ArrayExamples();
		ArrayList<String> listOfAnimals = new ArrayList<String>();
		listOfAnimals = arrayExamples.listOfAnimals();
		ArrayList<String> listOfAnimals2 = new ArrayList<String>();
		listOfAnimals2.addAll(listOfAnimals);
		listOfAnimals2.add("Dog");
		listOfAnimals2.add("Cat");
//		Iterator itr = listOfAnimals2.iterator(); 
////		while(itr.hasNext()) {
////			System.out.println(itr.next());
////			}

		return listOfAnimals2;
	}

	public ArrayList<String> listOfAnimals3() {
		ArrayExamples arrayExamples = new ArrayExamples();
		ArrayList<String> listOfAnimals2 = new ArrayList<String>();
		listOfAnimals2 = arrayExamples.listOfAnimals2();
		ArrayList<String> listOfAnimals3 = new ArrayList<String>();
		listOfAnimals3.addAll(listOfAnimals2());
		listOfAnimals3.remove(0);
		Iterator itr = listOfAnimals3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		return listOfAnimals3;
	}

	public ArrayList<String> listOfAnimals4() {
		ArrayExamples arrayExamples = new ArrayExamples();
		ArrayList<String> listOfAnimals3 = new ArrayList<String>();
		listOfAnimals3 = arrayExamples.listOfAnimals3();
		ArrayList<String> listOfAnimals4 = new ArrayList<String>();
		listOfAnimals4.addAll(listOfAnimals3());
		listOfAnimals4.clear();
//		Iterator itr = listOfAnimals4.iterator(); 
//			while(itr.hasNext()) {
//			System.out.println(itr.next());
		// }
		return listOfAnimals4;
}
}
	