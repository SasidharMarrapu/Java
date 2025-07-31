package encapsulation;

class Dog{
	private String name;
	private String breed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void bark() {
		System.out.println("Woof! My name is " + getName());
		System.out.println("Breed is: " + getBreed());
	}
}

public class introduce {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("Chimtu");
		d.setBreed("German Shepherd");
		d.bark();
	}
}
