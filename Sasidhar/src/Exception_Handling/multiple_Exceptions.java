package Exception_Handling;

public class multiple_Exceptions {
	public void display() {
		try {
			int a = 10/0;
			int arr[] = {1,2,3};
			System.out.println(arr[6]);
		}
		catch(ArithmeticException e){
			System.out.println("number cannot devide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("We cannot access element in the array");
		}
	}
	public static void main(String[] args) {
		multiple_Exceptions obj = new multiple_Exceptions();
		obj.display();
	}
}
