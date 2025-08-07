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
}
class Mysql implements EmpData{
	public void get_Data_by_Id() {
		System.out.println("Data from MySql Database");
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
		EmpService service = new EmpService(m);
		service.display();
		o.print_data();
		m.print_data();
	}
}
