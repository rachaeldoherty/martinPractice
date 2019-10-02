package practice2;

public class hasBad {
	public boolean hasBad(String str) {
		String str2 = str.substring(1, 4); 

		if((str.startsWith("bad")) || (str2.startsWith("bad"))){
			return true;
		}
		
		return false;
	}

}
