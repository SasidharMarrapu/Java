package tasks2;

import java.util.Scanner;
public class duck_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int digit = 0;
		boolean isDuck = false;
		
		if(number == 0) {
			System.out.println("Not a Duck number");
			return;
		}
		
		while(number > 0) {
			digit = number % 10;
			if(digit == 0) {
				isDuck = true;
			}
			number = number / 10;
		}
		if(isDuck)
			System.out.println("Duck number");
		else
			System.out.println("Not a duck number");
	}
}
