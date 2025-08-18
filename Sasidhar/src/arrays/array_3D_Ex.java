package arrays;

public class array_3D_Ex {
	public static void main(String[] args) {
		int a[][][]= {{{1,2,3},{4,5,6},{7,8,9}},{{9,8,7},{6,5,4},{3,2,1}}};
		
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				for(int k=0; k < a[i][j].length; k++) {
					System.out.println(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}