package tasks2;
import java.util.Scanner;
public class Strong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int digit = 0, original_num = num;
		double sum = 0;
		
		while (num > 0) {
            digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == original_num) {
            System.out.println(original_num + " is a Strong number");
        } else {
            System.out.println(original_num + " is Not a Strong number");
        }
	}
	static int factorial(int n) {
		int fact = 1;
		for(int i =1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}
