package Tasks;
import java.util.Scanner;
public class search_element_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {10,20,30,40,50,60,70};

		
		System.out.println("Enter an element ro search: ");
		int search_element = sc.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == search_element) {
				int position = i;
				System.out.println("Found at index position: " + position);
				break;
			}
			else {
				System.out.println("Not found");
			}
			
		}
		
	}

}
