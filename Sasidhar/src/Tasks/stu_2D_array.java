package Tasks;

public class stu_2D_array {

	public static void main(String[] args) {
		int[][] marks = {{88,95,75},
				             {79,85,94},
			               	{93,91,83}
		};
		
		for (int i = 0; i < marks.length; i++) {
			int total = 0;
			for(int j = 0; j < marks[i].length; j++) {
				total += marks[i][j];
			}
			System.out.println("Student marks " +(i+1) + "Total: " + total);
		}

	}

}
