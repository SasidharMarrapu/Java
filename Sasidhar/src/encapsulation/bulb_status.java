package encapsulation;

class LightBulb{
	private boolean isOn = false;
	
	public void turnOn() {
		isOn = true;
		System.out.println("Bulb is on");
	}
	public void turnOff() {
		isOn = false;
		System.out.println("Bulb is off");
	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
}

public class bulb_status {

	public static void main(String[] args) {
		LightBulb b = new LightBulb();
		System.out.println("Current state of bulb: " + b.isOn());
		b.turnOn();
		b.turnOff();
	}
}
