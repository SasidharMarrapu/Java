package inheritance;

class Shape
{
	public void draw() {
		System.out.println("Draw a shape");
	}
}
class Circle extends Shape
{
	public void draw_circle() {
		System.out.println("Draw a Circle");
	}
}
public class single_inheritance1 {
	public static void main(String[] args) {
		Circle s = new Circle();
		s.draw();
		s.draw_circle();
	}

}
