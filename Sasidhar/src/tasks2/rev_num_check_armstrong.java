package tasks2;

import java.util.Scanner;
public class rev_num_check_armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int reverse = 0, digit =0;
		int original_num = num;
		
		while(num > 0) {
			digit = num % 10;
			reverse = reverse*10 + digit;
			num = num/10;
		}
		System.out.println("Reversed number: "+reverse);
		
		// checking ArmStrong number
		
		int count = 0,temp1=0,temp2=0;
		double sum =0;
		
		temp1 = original_num;
		while(temp1 > 0) {
			temp1 = temp1/10;
			count++;
		}
		System.out.println("Count: "+count);
		
		temp2 = original_num;
		while(temp2 > 0) {
			digit = temp2%10;
			sum = (sum+Math.pow(digit, count));
			temp2 =temp2/10;
		}
		if(sum == original_num) {
			System.out.println("ArmStrong number");
		}
		else {
			System.out.println("Not a ArmStrong number");
		}
	}
}

