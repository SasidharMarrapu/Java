package arrays;

public class even_elements_array {
	public static void main(String[] args) {
		int even_count = 0, odd_count = 0;
		int a[] = {2,14,49,51,94,3,6,88};
		for(int i = 0;i < a.length;i++) {
			if(a[i] % 2 == 0) {
				System.out.println(a[i]);
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		System.out.println("Count of Even numbers: "+even_count);
		System.out.println("Count of odd numbers: "+odd_count);
	}
}
