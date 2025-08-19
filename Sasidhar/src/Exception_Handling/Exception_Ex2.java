package Exception_Handling;

public class Exception_Ex2 {
	public void display() {
		try {
		int a = 1/0;
		System.out.println(a);
	}
	catch(ArithmeticException e) {
		System.out.println("number cannot divide by 0");
		}
	}
	public static void main(String[] args) {
		Exception_Ex2 obj= new Exception_Ex2();
		try {
			obj.display();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception, do not divided by zero");
		}
	}
}
