package abstraction;

abstract class Vehicle{
	abstract String StartEngine();
	abstract void StopEngine();
}

class car extends Vehicle{
	public String StartEngine() {
		return "Car Engine Started";
	}
	public void StopEngine() {
		System.out.println("Car Engine Stopped");
	}
}

class truck extends Vehicle{
	public String StartEngine() {
		return "Truck Engine Started";
	}
	public void StopEngine() {
		System.out.println("Truck Engine Stopped");
	}
}

class bike extends Vehicle{
	String StartEngine() {
		return "Bike Engine Started";
	}
	void StopEngine() {
		System.out.println("Bike Engine Stopped");
	}
}

public class vehicleManagementSystem {

	public static void main(String[] args) {
		Vehicle v1 = new car();
		System.out.println(v1.StartEngine());
		v1.StopEngine();
		
		Vehicle v2 = new truck();
		System.out.println(v2.StartEngine());
		v2.StopEngine();;
		
		Vehicle v3 = new bike();
		System.out.println(v3.StartEngine());
		v3.StopEngine();

	}

}
