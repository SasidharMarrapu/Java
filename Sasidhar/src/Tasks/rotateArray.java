package Tasks;

public class rotateArray {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		int n = nums.length;
		k = k % n;
		int[] rotatedarray = new int[n];
		for(int i = 0; i < n; i++) {
			rotatedarray[(i + k) % n] = nums[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(" "+rotatedarray[i]);
		}

	}

}
