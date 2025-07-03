package Tasks;
import java.util.Scanner;
public class update_array {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	        int[] array = {10, 20, 30, 40, 50};
	        System.out.println("Original array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        System.out.println("Enter index to update: ");
	        int index = sc.nextInt();
	        System.out.println("Enter new Value: ");
	        int newvalue = sc.nextInt();
	        
	        array[index] = newvalue;
	        System.out.println("Updated array");
	        for(int num: array) {
	        	    System.out.println(num);
	        }
	}

}
