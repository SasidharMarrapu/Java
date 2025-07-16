package Tasks;

class rectangle{
	int length, breadth;
	
	void dimensions(int l, int b) {
		length = l;
		breadth = b;
	}
}

class area extends rectangle{
	int calculateArea() {
		return length * breadth;
	}
}
public class inheritance1 {
	public static void main(String[] args) {
		area a = new area();
		a.dimensions(10, 20);
		int calculatedArea = a.calculateArea();
		System.out.println("Calculated Rectangular Area: "+ calculatedArea);
	}
}
