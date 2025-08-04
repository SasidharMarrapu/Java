package constructors;

class Student{
	String name;
	int age;
	
	public Student() {
		this("NoArgument", 000);
	}
	
	public Student(String name) {
		this.name = name;
		age = 20;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		Student s1 = new Student("Sasi");
		Student s2 = new Student("Dinesh",21);
		Student s = new Student(); 
		System.out.println("name is: "+ s.name + " and age is: "+s.age);
		System.out.println("name is: "+ s1.name + " and age is: "+s1.age);
		System.out.println("name is: "+ s2.name + " and age is: "+s2.age);
	}

}
