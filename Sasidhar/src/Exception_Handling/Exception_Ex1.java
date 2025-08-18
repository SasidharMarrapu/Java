package Exception_Handling;

public class Exception_Ex1 {
	public void show() {
	try {
		int a = 1/0;
		System.out.println("A value: "+a);
	}
	catch(ArithmeticException e){
		System.out.println("Number should not devide by 0");
		}
	}
	public static void main(String[] args) {
		Exception_Ex1 obj = new Exception_Ex1();
		obj.show();
	}
}

