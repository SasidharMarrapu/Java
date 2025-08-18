package arrays;

public class sorting_array {
	public static void main(String[] args) {
		int[] data = {1,2,3,0,4,9,6,7,5,8};
		
		for(int i = 0; i < data.length; i++) {
			for(int j = i+1; j < data.length; j++) {
				if(data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int k = 0; k < data.length; k++) {
			System.out.println(data[k] + " ");
		}
	}
}