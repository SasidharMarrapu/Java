package Interface;

sealed interface S permits A1,A2{
	public void display();
}
final class A1 implements S {
	public void display() {
		System.out.println("Display A1 class");
	}
}
final class A2 implements S {
	public void display() {
		System.out.println("Display A2 class");
	}
}
public class sealed_permits_keyword {
	public static void main(String[] args) {
		A1 obj1 = new A1();
		A2 obj2 = new A2();
		obj1.display();
		obj2.display();
	}
}
