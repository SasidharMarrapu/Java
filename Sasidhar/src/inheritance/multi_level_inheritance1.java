package inheritance;

class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Dog is barking");
	}
}
class Labrador extends Dog{
	void displayColor() {
		System.out.println("Labrador is Golden color");
	}
}
public class multi_level_inheritance1 {
	public static void main(String[] args) {
		Labrador obj = new Labrador();
		obj.eat();
		obj.bark();
		obj.displayColor();
	}
}
