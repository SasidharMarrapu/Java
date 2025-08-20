package Exception_Handling;

public class throw_unchecked_exception {
	public void show() {
		int val = -1;
		try {
		if(val < 0) {
			throw new IllegalArgumentException("Value should be greater than 0");
		}
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		throw_unchecked_exception obj = new throw_unchecked_exception();
		obj.show();
	}
}
