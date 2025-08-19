package Exception_Handling;

public class multiple_catch_Exceptions {
	public void display() {
		try {
			int a = 10/0;
			System.out.println(a);
			//in a try block, only one exception will be handled
			int arr[] = {1,2,3};
			System.out.println(arr[6]);
		}
		catch(ArithmeticException e){
			System.out.println("Number cannot devide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is exceeded");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Exception");
		}
		catch(Exception e) {
			System.out.println("Exception class catch block");
		}
	}
	public static void main(String[] args) {
		multiple_catch_Exceptions obj = new multiple_catch_Exceptions();
		obj.display();
	}
}
