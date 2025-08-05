package arrays;

public class min_max_array {

	public static void main(String[] args) {
		int[] arr = {5,1,9,3,7,4,2};
		int min = 5, max = 5;
		for(int i = 1; i< arr.length; i++) {
			if(min < arr[i]) {
				min = arr[i];
			}
			if(max > arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Minimum value in the array: "+min);
		System.out.println("Maximum value in the array: "+max);
	}
}
