package polymorphism;

class MathOperations{
	int multiply(int a, int b) {
		return a*b;
	}
	
	int multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	double multiply(double a, int b) {
		return a*b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		MathOperations math = new MathOperations();
		System.out.println(math.multiply(2.5,3));
		System.out.println(math.multiply(3, 2));
		System.out.println(math.multiply(2, 3, 4));
	}
}

