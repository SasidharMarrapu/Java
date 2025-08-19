package Exception_Handling;

public class nested_try {
	public void show() {
		try {
			int a = 2/0;
			System.out.println(a);
			try {
				int arr[]= {1,2,3};
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array size is 3");
			}
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
		}	
	}
	public static void main(String[] args) {
		nested_try obj = new nested_try();
		obj.show();
	}
}
