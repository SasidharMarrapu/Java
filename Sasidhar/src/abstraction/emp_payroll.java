package abstraction;

abstract class employee{
	abstract String name();
	abstract double salary();
}

class daily_wage extends employee{
	public String name() {
		return "Daily wage";
	}
	public double salary() {
		return 500;
	}
}

class monthly_wage extends employee{
	public String name() {
		return "monthly wage";
	}
	public double salary() {
		return 20000;
	}
}

class hourly_wage extends employee{
	public String name() {
		return "hourly wage";
	}
	public double salary() {
		return 100;
	}
}


public class emp_payroll {

	public static void main(String[] args) {
		employee e1 = new daily_wage();
		System.out.println(e1.name());
		System.out.println(e1.salary());
		
		employee e2 = new monthly_wage();
		System.out.println(e2.name());
		System.out.println(e2.salary());
		
		employee e3 = new hourly_wage();
		System.out.println(e3.name());
		System.out.println(e3.salary());

	}

}
