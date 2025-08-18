package arrays;

public class primenumbers_array {
	public static void main(String[] args) {
		int a[] = {1,5,4,3,9,7};
		for(int i=0;i<a.length;i++) {
			int count=0;
			int num = a[i];
			
		if(num > 1) {
			for(int j =2; j <= num/2;j++) {
				if(num % j == 0) {
					count++;
				}
			}
			if(count==0)
				System.out.println(num+" Prime");
			else
				System.out.println(num+" Not prime");
		}
		else {
			System.out.println(num+" Not prime");
		}
		}
}
}
