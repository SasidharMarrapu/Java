package tasks2;

// this keyword example...
class A{
	A()
	{
		B b = new B(this); // object of B class is refers object of A class
	}
	public void display() {
		System.out.println("Display method");
	}
}

public class B {
	B(A obj){
		obj.display();
	}
	public static void main(String[] args) {
		new A();
	}

}
