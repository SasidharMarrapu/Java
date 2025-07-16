package constructors;

class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public void CalculateArea() {
		System.out.println("Area of Rectangle is: " + length * width);
	}
}

public class Area_calculation {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4);
		r.CalculateArea();

}
}
