package inheritance;

class MathUtility{
	static int square(int n) {
		return n*n;
	}
}
class Calculator extends MathUtility{
	static int cube(int n) {
		return n*square(n);
	}
}
public class math_operations {
	public static void main(String[] args) {
		System.out.println("Square: " + Calculator.square(5));
		System.out.println("Cube: " + Calculator.cube(2));
	}

}
