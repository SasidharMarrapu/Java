package tasks2;

public class final_keyword {
	final int empid;
	float sal;
	
	final_keyword(float sal, int empid){
		this.sal = sal;
		this.empid = empid;
	}
	public static void main(String[] args) {
		final_keyword e = new final_keyword(1000,1);
		System.out.println("empid: "+e.empid);
		System.out.println("salary: "+e.sal);
		
		final_keyword e1 = new final_keyword(2000,2);
		System.out.println("empid: "+e1.empid);
		System.out.println("salary: "+e1.sal);
	}
}
