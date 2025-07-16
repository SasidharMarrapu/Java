package constructors;

class Person{
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void introduce() {
		System.out.println("My name is: "+ name + " and age is: " + age);
	}
}

public class personDetails {

	public static void main(String[] args) {
		Person p1 = new Person("Sasi", 20);
		p1.introduce();

	}
}
