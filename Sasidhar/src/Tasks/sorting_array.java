package Tasks;

public class sorting_array {

	public static void main(String[] args) {
		int[] data = {1,2,3,0,4,9,6,7,0,1,2,3};
		for(int i = 0; i < data.length; i++) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		for(int i = 0; i < data.length - 1; i++) {
			for(int j = 0; j < data.length - 1 - i; j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int num: data) {
			System.out.println(num + " ");
		}

	}

}
