package constructors;

class person{
	String name;
	int age;
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Employee extends person{
	private double salary;
	
	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	public void displaySalary() {
		System.out.println("salary of "+name+" is "+salary);
	}
}

public class Employee_salary_Details {

	public static void main(String[] args) {
		Employee p = new Employee("Sasi",20,20000);
		p.displaySalary();
		
	}
}
