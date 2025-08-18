package arrays;

public class missingNumber_array {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,8,9,7,6,10};
		
		for(int i=1;i<a.length;i++) {
			boolean isPresent = check(a,i);
			if(isPresent == false) {
				System.out.println("value:" +i);
				break;
			}
		}
	}
		private static boolean check(int[] a, int i) {
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
					return true;
				}
			}
			return false;
		}
	}

