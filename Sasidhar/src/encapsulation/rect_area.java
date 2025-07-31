package encapsulation;

class Rectangle{
	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void getArea() {
		double area = length * width;
		System.out.println("Area of Rectangle is: " + area);
	}
	public void getPerimeter() {
		double perimeter = 2*(length + width);
		System.out.println("Perimeter of Rectangle is: " + perimeter);
	}
}
public class rect_area {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(12.3);
		r.setWidth(10.9);
		r.getLength();
		r.getWidth();
		r.getArea();
		r.getPerimeter();
	}

}
