package Exception_Handling;

import java.io.IOException;

public class throws_checked_exception {
	public void display() throws IOException {
		int val =-1;
		throw new IOException("Value should be greater than with 0");
	}
	public static void main(String[] args) {
		throws_checked_exception obj= new throws_checked_exception();
		try {
			obj.display();
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
	}
}
