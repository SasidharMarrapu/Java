package arrays;

public class merge_arrays {
	public static void main(String[] args) {
		int a[] = {2,5,6,3,7,8};
		int b[] = {1,8,9,7,6,3};
		
		int c[] = new int[a.length + b.length];
		// storing a[] array values
		for(int i = 0;i < a.length; i++) {
			c[i] = a[i];
		}
		// storing b[] array values
		for(int j = 0;j < b.length; j++) {
			c[j+a.length] = b[j];
		}
		for(int k = 0; k < c.length; k++) {
			System.out.println(c[k]);
		}
	}
}