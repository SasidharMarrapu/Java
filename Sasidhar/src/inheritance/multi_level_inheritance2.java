package inheritance;

class Person1{
	String name;
	Person1(String name){
		this.name = name;
	}
	void displayInfo() {
		System.out.println("Name: "+name);
	}
}
class Employee1 extends Person1{
	float salary;
	Employee1(String name,float salary){
		super("Dinesh");
		this.salary = salary;
	}
	void displaySalary() {
		System.out.println("Salary: "+salary);
	}
}
class Manager extends Employee1{
	String dept;
	Manager(String name, float salary, String dept){
		super("Dinesh",40000);
		this.dept = dept;
	}
	void displayDepartment() {
		System.out.println("Department: "+dept);
	}
}
public class multi_level_inheritance2 {

	public static void main(String[] args) {
		Manager m = new Manager("Dinesh",10000,"CSE");
		m.displayInfo();
		m.displaySalary();
		m.displayDepartment();
	}
}
