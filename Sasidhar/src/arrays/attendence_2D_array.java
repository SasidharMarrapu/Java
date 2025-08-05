package arrays;

public class attendence_2D_array {

	public static void main(String[] args) {
		int[][] emp = new int[5][3];
//		emp[0][0] = 1;
//		emp[0][1] = 1;
//		emp[0][2] = 1;
//		
//		emp[1][0] = 1;
//		emp[1][1] = 0;
//		emp[1][2] = 1;
//		
//		emp[2][0] = 0;
//		emp[2][1] = 1;
//		emp[2][2] = 1;
//		
//		emp[3][0] = 1;
//		emp[3][1] = 1;
//		emp[3][2] = 0;
//		
//		emp[4][0] = 1;
//		emp[4][1] = 1;
//		emp[4][2] = 1;
		
		emp[1][1] = -1;
		emp[2][0] = -1;
		emp[3][2] = -1;
		
		System.out.println("Attendance Chart of 5 Employees: ");
		for(int i = 0; i < emp.length; i++) {
			for(int j = 0; j < emp[i].length; j++) {
				System.out.print(emp[i][j] + 1 + " ");
			}
			System.out.println();
		}

	}

}
