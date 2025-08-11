package Interface;

interface EmpData{
	public void get_Data_by_Id();
	default void print_data() // Default method we can override in any class
	{
		System.out.println("Print Data");
	}
}
class Oracle implements EmpData{
	public void get_Data_by_Id() {
		System.out.println("Data from Oracle Database");
	}
	public void print_data() {   // Overriding the default method
		System.out.println("Oralce Data");
	}
}
class Mysql implements EmpData{
	public void get_Data_by_Id() {
		System.out.println("Data from MySql Database");
	}
	public void print_data() { // Overriding default method
		System.out.println("MySql Data");
	}
}
//Service class
class EmpService{
	EmpData e;
	EmpService(EmpData obj){
		this.e = obj;
	}
	public void display() {
		e.get_Data_by_Id();
	}
}
public class Employee {
	public static void main(String[] args) {
		Oracle o = new Oracle();
		Mysql m = new Mysql();
		EmpService service = new EmpService(o);
		service.display();
		o.print_data();
		m.print_data();
	}
}
