package encapsulation;

class Person{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) { //if age > 0 then age will be set
		if(age > 0) {             //if age is negative it is set to zero.
			this.age = age;
		}
		else {
			age = 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class check_age {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(21);
		System.out.println("Age is: " + p.getAge());
		p.setName("Sasi");
		System.out.println("Name is: " + p.getName());
	}

}
