package arrays;

public class tic_tac_toe_2D_array {

	public static void main(String[] args) {
		String[][] tic_tac_toe = new String[3][3];
		tic_tac_toe[0][0] = "X";
		tic_tac_toe[0][1] = "O";
		tic_tac_toe[0][2] = "X";
		
		tic_tac_toe[1][0] = " ";
		tic_tac_toe[1][1] = "X";
		tic_tac_toe[1][2] = "O";
		
		tic_tac_toe[2][0] = "O";
		tic_tac_toe[2][1] = " ";
		tic_tac_toe[2][2] = "X";
		

		for(int i = 0; i < tic_tac_toe.length ; i++) {
			for(int j = 0; j < tic_tac_toe[i].length; j++) {
				System.out.print(tic_tac_toe[i][j] + " ");
			}
			System.out.println();
		}
	}

}
