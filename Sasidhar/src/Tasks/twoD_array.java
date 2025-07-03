package Tasks;

public class twoD_array {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{3,4},{5,6}};
		int[][] arr2 = {{7,8},{9,10},{11,12}};
		int[][] sum = new int[3][3];
		
		System.out.println("Array1: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Array2: ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Sum of the Two Arrays: " );
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length ; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
