package Tasks;

import java.util.Scanner;
public class rev_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String name = sc.nextLine();
		
		String reversed = "";
		
		for(int i = name.length() - 1; i >= 0; i--) {
			reversed = reversed + name.charAt(i);
		}
		System.out.println("Reversed string: "+reversed);
		
		}
		

	}


