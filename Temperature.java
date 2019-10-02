package practice2;

public class Temperature {


	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Temperature temperature = new Temperature();
		//System.out.println(temperature.icyHot(120,-1));	// true
//		System.out.println(temperature.icyHot(-1,120)); // true
//		System.out.println(temperature.icyHot(120,2)); 	// false
//	}

	public boolean icyHot(int temp1, int temp2) {
			boolean result = false; // always required
			
		if ((temp1 > 100) && (temp2 < 0)) {
			return true; 
		} else if 
			((temp1 < 0)&& (temp2 > 100)) {
			return true;
	}
		
		return result;
		
}
}


