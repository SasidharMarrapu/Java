package Tasks;
import java.util.Scanner;
public class armStrong_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int count = 0,temp1=0,temp2=0,digit=0;
		double sum =0;
		
		temp1 = num;
		while(temp1 > 0) {
			temp1 = temp1/10;
			count++;
		}
		System.out.println("Count: "+count);
		
		temp2=num;
		while(temp2 > 0) {
			digit = temp2%10;
			sum = (sum+Math.pow(digit, count));
			temp2 =temp2/10;
		}
		if(sum == num) {
			System.out.println("ArmStrong number");
		}
		else {
			System.out.println("Not a ArmStrong number");
		}
	}

}
