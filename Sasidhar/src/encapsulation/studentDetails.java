package encapsulation;

class Student{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
	}
		else {
			System.out.println("Invalid age");
		}
}
}

public class studentDetails {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Venky");
		s.setAge(20);
		System.out.println("Name is: " + s.getName());
		System.out.println("Age is: " + s.getAge());

	}

}
