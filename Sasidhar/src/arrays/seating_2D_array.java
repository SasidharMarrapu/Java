package arrays;
import java.util.Scanner;
public class seating_2D_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] chart = new int[3][4];
		chart[1][2] = 1;
		for(int i = 0; i < chart.length; i++) {
			for(int j = 0; j < chart[i].length; j++) {
				System.out.print(chart[i][j] + " ");
			}
			System.out.println();
		}
	}

}
