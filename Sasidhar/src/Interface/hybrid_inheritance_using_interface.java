package Interface;

class Employee1 {
	int empid;
	String ename;
	float sal;
	Employee1(int id, String name, float salary){
		empid = id;
		ename = name;
		sal = salary;
	}
}
interface Backend_Developer{
	public void backend_development();
}
interface Frontend_Developer{
	public void frontend_development(); 
}
class Fullstack_developer extends Employee1 implements Backend_Developer,Frontend_Developer{
	Fullstack_developer(int empid, String ename, float sal){
		super(empid, ename, sal);
	}
	public void backend_development() {
		System.out.println("Backend Developing using Java language");
	}
	public void frontend_development() {
		System.out.println("FrontEnd Developing using HTML,CSS,JavaScript languages");
	}
}
public class hybrid_inheritance_using_interface {
	public static void main(String[] args) {
		Fullstack_developer f = new Fullstack_developer(11,"Dinesh",40000);
		f.frontend_development();
		f.backend_development();
	}
}
