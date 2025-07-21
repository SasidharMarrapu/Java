package inheritance;


class Employee {
 String name;
 int empId;
 double basicSalary;

 void setEmployeeDetails(String n, int id, double salary) {
     name = n;
     empId = id;
     basicSalary = salary;
 }
}


class SalaryCalculator extends Employee {
 double hra, da, grossSalary;

 void calculateSalary() {
     hra = 0.20 * basicSalary;
     da = 0.10 * basicSalary;  
     grossSalary = basicSalary + hra + da;
 }

 void displayDetails() {
     System.out.println("Employee ID: " + empId);
     System.out.println("Name: " + name);
     System.out.println("Basic Salary: " + basicSalary);
     System.out.println("HRA (20%): " + hra);
     System.out.println("DA (10%): " + da);
     System.out.println("Gross Salary: " + grossSalary);
 }
}



public class inheritance2 {

	public static void main(String[] args) {
		SalaryCalculator emp = new SalaryCalculator();
	     emp.setEmployeeDetails("John", 101, 30000);  // Example values
	     emp.calculateSalary();
	     emp.displayDetails();

	}

}
