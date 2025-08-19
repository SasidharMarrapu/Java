package Exception_Handling;

public class Exception_Ex3 {
	public void show() {
		try {
			int a[] = {1,2,3,4};
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is exceeded");
			}
		}
	public void display() {
		int a=11/0;
		System.out.println(a);
	}
public static void main(String[] args) {
	Exception_Ex3 obj = new Exception_Ex3();
	try {
		obj.show();
		obj.display();
	}
	catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception");
		}
	}
}
