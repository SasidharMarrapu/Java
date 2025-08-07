package Interface;

interface i1{
	int a = 20;
	public void display();
}
class A {
	public void show() {
		System.out.println("Show Method");
	}
}
// A class can implements any number of interfaces at a time..
class B extends A implements i1{
	public void display() {
		System.out.println("Display Method");
	}
}
class C implements i1{
	public void display() {
		System.out.println("A value is: "+a);
	}
}
public class class_interface {
	public static void main(String[] args) {
		C c = new C();
		c.display();
		B b = new B();
		b.display();
		b.show();
	}
}
