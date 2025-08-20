package Exception_Handling;

class MyException extends Exception{
	String msg = null;
	MyException(String msg){
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}
public class custom_exception {
	public void show() {
		int age = 10;
		try {
		if(age<18) {
			throw new MyException("Age should be greater than 18");
		}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		custom_exception obj = new custom_exception();
		obj.show();
	}
}
