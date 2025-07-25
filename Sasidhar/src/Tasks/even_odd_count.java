package Tasks;
import java.util.Scanner;
public class even_odd_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int digit = 0, even_count=0,odd_count=0;
		
		do {
			digit = num%10;
			if(digit%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num = num/10;
		}while(num>0);
		System.out.println("Even_count: "+even_count);
		System.out.println("Odd_count: "+odd_count);
	}
}
