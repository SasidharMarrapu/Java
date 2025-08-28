package arrays;

public class duplicates_array {
	public static void main(String[] args) {
		int arr[] = {1,2,5,4,6,7,6,3,1,8,2,9};
		int temp[] = new int[arr.length];
		int j=0;
		
		for(int i = 0; i < arr.length; i++) {
			boolean found = false;
			for(int k = 0; k < j; k++) {
				if(arr[i]==temp[k]) {
					found = true;
					break;
				}
			}
			if(!found) {
				temp[j++]=arr[i];
			}
		}
		for(int l = 0; l < j; l++) {
			System.out.println(temp[l]+" ");
		}
	}
}