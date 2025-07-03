package Tasks;

public class totalbill_2D_array {

	public static void main(String[] args) {
		int[][] bill = {{30,65,25},
				{55,30,65},
				{60,35,10}
		};
		for(int i = 0; i < bill.length; i++) {
			int total_bill = 0;
			for(int j = 0; j< bill[i].length; j++) {
				total_bill += bill[i][j];
			}
			System.out.println("Customer " +(i+1)+ " Bill is: " + total_bill);
		}

	}

}
