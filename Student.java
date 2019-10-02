package practice2;


/**
 * 
 * @author DOH20170846
 *
 */
public class Student {

	
	/**
	 * Constructor names and ages of students
	 */
	
	private int age; 
	private String name; 
	
	public static int numberOfStudents; 
	public Student(String name, int age) { //CONSTRUCTOR
		this.name = name; 
		this.age = age; 
		numberOfStudents++; 
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getNumberOfStudents() {
		return numberOfStudents; 
	}
	}


