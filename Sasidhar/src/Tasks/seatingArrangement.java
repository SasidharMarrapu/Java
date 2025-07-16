package Tasks;

public class seatingArrangement {

	public static void main(String[] args) {
		int[][] classroom = {
			    {101, 102, 103, 104, 105},
			    {106, 107, 108, 109, 110},
			    {111, 112, 113, 114, 115},
			    {116, 117, 118, 119, 120}
			};
		
		for(int i = 0; i < classroom.length; i++) {
			for(int j = 0; j < classroom[i].length; j++) {
				System.out.print(classroom[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		int maxID = classroom[0][0];
		for(int i = 0; i < classroom.length; i++) {
			for(int j = 0; j < classroom[i].length; j++) {
				sum += classroom[i][j];
				if(classroom[i][j] > maxID) {
					maxID = classroom[i][j];
				}
			}
		}
		System.out.println("Total sum: " + sum);
		System.out.println("Largest ID: " + maxID);
		
	}

}
