package tasks2;

import java.util.Scanner;
public class duck_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String number = sc.next();
	
		
		if(number.charAt(0)=='0') {
			System.out.println("Not a Duck number");
		}
		else if(number.contains("0")) {
			System.out.println("Duck number");
		}
		else {
			System.out.println("Not a Duck number");
		}
	}
}
