package inheritance;

class rectangle{
	float length, breadth;
	
	rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}
class Area extends rectangle{
	Area(){
		super(11,20);
	}
	public void calculateArea() {
		System.out.println(length * breadth);
	}
}
public class area_calc {
	public static void main(String[] args) {
		Area a = new Area();
		a.calculateArea();
	}
}
