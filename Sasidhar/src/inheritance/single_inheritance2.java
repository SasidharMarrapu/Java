package inheritance;

class Vehicle{
	String type = "Vehicle";
	Vehicle(){
		this.type = type;
	}
	public void displayType() {
		System.out.println("Displaying the type: "+type);
	}
}
class Car extends Vehicle{
	String type = "Car";
	Car(){
		this.type = type;
	}
	public void displayCarType() {
		System.out.println("Displaying the vehicle type: "+type);
	}
}
public class single_inheritance2 {
	public static void main(String[] args) {
		Car c = new Car();
		c.displayType();
		c.displayCarType();
	}

}
