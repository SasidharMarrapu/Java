package constructors;

class student{
	private String name;
	private int age;
	private double GPA;
	
	public student(String name, int age, double GPA) {
		this.name = name;
		this.age = age;
		this.GPA = GPA;
	}
	
	public student(String name, int age) {
		this(name, age, 0.0);
	}
	
	public void displayGPA() {
		System.out.println("Student name is "+ name +" and Age is: "+ age +" and GPA is: "+ GPA);
	}
}

public class stu_GPA {

	public static void main(String[] args) {
		student s1 = new student("Sasi", 20, 7.23);
		student s2 = new student("Venky", 21);
		s1.displayGPA();
		s2.displayGPA();
		
	}
}
