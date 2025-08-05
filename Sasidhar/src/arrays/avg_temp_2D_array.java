package arrays;

public class avg_temp_2D_array {

	public static void main(String[] args) {
		double[][] temp = {{32.6,35.1,40.3,37.8,33.9},
				{40.3,39.2,35.6,42.9,31.4}
		};
		for(int i = 0; i < temp.length; i++) {
			double avg = 0;
			double sum = 0;
			for(int j = 0; j < temp[i].length; j++) {
				sum += temp[i][j];
				
			}
			avg = sum/temp[i].length;
			System.out.println("Average Temparature of City "+ (i+1) +" is: " + avg);
		}

	}

}
