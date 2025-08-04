package polymorphism;

interface Drawable{
	void draw();
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Draw a Circle");
	}
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Draw a Rectangle");
	}
}
public class interface_polymorphism {
	public static void main(String[] args) {
		Drawable c = new Circle();
		Drawable r = new Rectangle();
		c.draw();
		r.draw();
	}
}
