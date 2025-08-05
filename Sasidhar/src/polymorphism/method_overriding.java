package polymorphism;

class Animal{
	public void sound() {
		System.out.println("Animal Sounds");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog sounds ");
	}
}				
class Cat extends Animal{
	public void sound() {
		System.out.println("Cat sounds ");
	}
	public void display() {
		System.out.println("Cat Animal");
	}
}
class Cow extends Animal{
	public void sound() {
		System.out.println("Cow sounds");
	}
}
public class method_overriding {

	public static void main(String[] args) {
		Animal obj1 = new Cow();
		obj1.sound();
		Animal obj2 = new Cat();
		obj2.sound();
		Cat c = (Cat)obj2;
		c.display();
		Animal obj3 = new Dog();
		obj3.sound();
	}
}
