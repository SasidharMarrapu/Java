package tasks2;

import java.util.Scanner;
public class check_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int digit = 0;
		
		while(num != 0) {
			digit = num % 10;
			if(digit > 0) {
				System.out.println("Positive: "+digit);
			}
			else if(digit < 0) {
				System.out.println("Negative: "+digit);
			}
			else {
				System.out.println("ZERO: "+digit);
			}
			num = num/10;
		}

	}

}
