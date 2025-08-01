package inheritance;

class Person{
	String name;
	int id;
	
	Person(String name, int id){
		this.id = id;
		this.name = name;
	}
}
class Student extends Person{
	int roll_no;
	Student(int roll_no){
		super("Dinesh",1111111);
		this.roll_no = roll_no;
	}
	public void dispalyStudentInfo() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("roll number: "+roll_no);
	}
}
public class single_inheritance3 {

	public static void main(String[] args) {
		Student s = new Student(102);
		s.dispalyStudentInfo();
	}
}
