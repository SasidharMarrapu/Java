package tasks2;

public class seating_arrangement {
	private boolean[][] seats;
	public seating_arrangement(int rows, int cols) {
		seats = new boolean[rows][cols];
	}
	// method to book seat
	public void book_seat(int row, int col) {
		if(!seats[row][col]) {
			seats[row][col] = true;
			System.out.println("Seat in row "+row+" and column "+col+" is Booked Successfully");
		}
		else{
			System.out.println("Seat in row "+row+" and column "+col+" is already Booked");
		}
	}
	// method to cancel seat
	public void cancel_seat(int row,int col) {
		if(seats[row][col]) {
			seats[row][col] = false;
			System.out.println("Seat in row "+row+" and column "+col+" is Cancelled Successfully");
		}
		else {
			System.out.println("Seat in row "+row+" and column "+col+" is alraedy Free");
		}
	}
	public boolean IsSeatAvailable(int row, int col) {
		return !seats[row][col];
	}
	// method to display seats
	public void displaySeats() {
		System.out.println("Displaying the seats");
		for(int i=0; i<seats.length; i++) {
			for(int j=0; j<seats[i].length; j++) {
				System.out.println(seats[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		seating_arrangement seat = new seating_arrangement(3,5);
		seat.book_seat(1,0);
		System.out.println("Seat is available or not: "+seat.IsSeatAvailable(0, 2));
		seat.cancel_seat(1, 0);
		seat.displaySeats();	
	}
}