package polymorphism;

class product{
	String name;
	double price;

	void applyDiscount() {
		System.out.println("No Discount for general products");
}
	void display() {
        System.out.println("Product: " + name + ", Price after discount: " + price);
    }
}

class Electronics extends product{
	void applyDiscount() {
		price = price - price * 0.10;
	}
}

class Clothing extends product{
	void applyDiscount() {
		price = price - price * 0.20;
	}
}

class Books extends product{
	void applyDiscount() {
		price = price - price * 0.05;
	}
}

public class Discount {

	public static void main(String[] args) {
		product[] products = new product[3];
		
		products[0] = new Electronics();
		products[0].name = "Laptop";
		products[0].price = 50000.00;
		
		products[1] = new Clothing();
		products[1].name = "Shirt";
		products[1].price = 500.00;
		
		products[2] = new Books();
		products[2].name = "RRB Book";
		products[2].price = 250.00;
		
		for(int i = 0; i < products.length; i++) {
			products[i].applyDiscount();
			products[i].display();
		}
	}
}

