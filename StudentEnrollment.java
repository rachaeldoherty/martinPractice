package practice2;

public class StudentEnrollment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objects of the Student Class
		Student student1 = new Student("Rachael", 29); //creating an object of Student, creating an instance of 
		Student student2 = new Student("Rachel", 33);
		Student student3 = new Student("Dearbhail", 25);
		System.out.println(Student.numberOfStudents);
		
		System.out.println(Student.getNumberOfStudents());// static and instance variables don't like each other
	}
	

	
	

}