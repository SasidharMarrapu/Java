package encapsulation;

class Product{
	private String productName;
	private double price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
		else {
			price = 0.0;
		}
	}
	public void displayProduct() {
		System.out.println("Product Details is: "+getProductName()+" - "+getPrice());
	}
}
public class online_store {

	public static void main(String[] args) {
		Product p = new Product();
		p.setProductName("Laptop");
		p.setPrice(62000);
		p.displayProduct();
	}

}
