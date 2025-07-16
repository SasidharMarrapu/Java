package abstraction;

abstract class User{
	abstract String login();
	abstract String viewDashBoard();
}

class customer extends User{
	public String login() {
		return "Customer Login Successfully";
	}
	public String viewDashBoard() {
		return "Customer DashBoard";
	}
}

class DeliveryPartner extends User{
	public String login() {
		return "Delivery_Partner Login Successfully";
	}
	public String viewDashBoard() {
		return "Delivery_Partner Dash Board";
	}
}

class RestaurantOwner extends User{
	public String login() {
		return "RestaurantOwner Login Successfully";
	}
	public String viewDashBoard() {
		return "RestaurantOwner Dash Board";
	}
}

public class Online_Food_Delivery {

	public static void main(String[] args) {
		User user1 = new customer();
		System.out.println(user1.login());
		System.out.println(user1.viewDashBoard());
		
		User user2 = new DeliveryPartner();
		System.out.println(user2.login());
		System.out.println(user2.viewDashBoard());
		
		User user3 = new RestaurantOwner();
		System.out.println(user3.login());
		System.out.println(user3.viewDashBoard());

	}

}
