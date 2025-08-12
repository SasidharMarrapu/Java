package Interface;

interface payable{
	public void process_payment();
}
interface Report{
	public void generate_report();
}
class Emp implements payable,Report{
	int empid;
	String name;
	float salary;
	Emp(int empid,String name,float salary){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public void generate_report() {
		System.out.println("id:"+empid + " Report is generated");
	}
	public void process_payment() {
		System.out.println(salary + " Payment is processed for "+name);
	}
}
public class multiple_inheritance_using_interface {
	public static void main(String[] args) {
		Emp e = new Emp(101,"Naidu",30000);
		e.generate_report();
		e.process_payment();
	}
}
