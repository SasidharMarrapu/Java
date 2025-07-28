package Tasks;
import java.util.Scanner;
public class doWhile_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int subchoice = 0;
		String cart[] = new String[20];
		int cartCount = 0;
		int prices[] = new int[20];
		int totalBill = 0;
		
		do {
			System.out.println("1.Chocolates");
			System.out.println("2.CoolDrinks");
			System.out.println("3.IceCreams");
			System.out.println("4.Exit");
			
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 -> {
				System.out.println("You selected Chocolates");
				System.out.println("Available Chocolates...");
				System.out.println("1.Dairy Milk - ₹100");
				System.out.println("2.Kit Kat - ₹30");
				System.out.println("3.5-Star - ₹20");
				System.out.println("Select your choice: ");
				subchoice = sc.nextInt();
				
				if(cartCount < cart.length) {
				switch(subchoice) {
				case 1 -> {
					cart[cartCount] = "DairyMilk";
					prices[cartCount++] = 100;
					totalBill += 100;
					System.out.println("You selected DairyMilk");
				}
				case 2 -> {
					cart[cartCount] = "Kit Kat";
					prices[cartCount++] = 30;
					totalBill += 30;
					System.out.println("You selected Kit Kat");
				}
				case 3 -> {
					cart[cartCount] = "5-Star";
					prices[cartCount++] = 20;
					totalBill += 20;
					System.out.println("You selected 5-Star");
				}
				default -> System.out.println("Enter Chocolate Choice correctly");
				}
				}
				else
					System.out.println("Your cart is full.....");
	
			}
			case 2 -> {
				System.out.println("You selected CoolDrinks");
				System.out.println("Available CoolDrinks...");
	            System.out.println("1.Coca-Cola - ₹60");
	            System.out.println("2.Sprite - ₹50");
	            System.out.println("3.Maaza - ₹65");
	            System.out.print("Select your CoolDrink: ");
	            subchoice = sc.nextInt();
	            
	            if(cartCount < cart.length) {
	            switch(subchoice) {
	            case 1 -> {
	            	cart[cartCount] = "Coca-Cola";
	            	prices[cartCount++] = 60;
	            	totalBill += 60;
	            	System.out.println("You selected Coca-Cola");
	            }
				case 2 -> {
					cart[cartCount] = "Sprite";
					prices[cartCount++] = 50;
					totalBill += 50;
					System.out.println("You selected Sprite");
				}
				case 3 -> {
					cart[cartCount] = "Maaza";
					prices[cartCount++] = 65;
					totalBill += 65;
					System.out.println("You selected Maaza");
				}
	            default -> System.out.println("Enter CoolDrink Choice correctly");
	            }}
	            else
	            	System.out.println("Your cart is full...");

			}
			
			case 3 -> {
				System.out.println("You selected IceCreams");
				System.out.println("Available IceCreams...");
	            System.out.println("1.Vanilla - ₹30");
	            System.out.println("2.Butterscotch - ₹45");
	            System.out.println("3.Strawberry - ₹25");
	            System.out.print("Select your Ice Cream: ");
	            subchoice = sc.nextInt();
	            
	            if(cartCount < cart.length) {
	            switch(subchoice) {
	            case 1 -> {
	            	cart[cartCount] = "Vanilla";
	            	prices[cartCount++] = 30;
	            	totalBill += 30;
	            	System.out.println("You selected Vanilla");
	            }
				case 2 -> {
					cart[cartCount] = "ButterScotch";
					prices[cartCount++] = 45;
					totalBill += 45;
					System.out.println("You selected ButterScotch");
				}
				case 3 -> {
					cart[cartCount]="Strawberry";
					prices[cartCount++] = 25;
					totalBill += 25;
					System.out.println("You selected Strawberry");
				}
	            default -> System.out.println("Enter IceCream Choice correctly");
	            }
	            }
	            else
	            	System.out.println("Your cart is full...");

			}
			case 4 -> { 
				System.out.println("..Final cart..");
				if(cartCount == 0) {
					System.out.println("No items are selected.....Please select..");
				}
				else {
					for(int i = 0;i < cartCount; i++) {
						System.out.println("- "+cart[i]+" - "+prices[i]);
					}
					System.out.println("Total Bill is: "+ totalBill);
				}
			}
			default -> System.out.println("Enter valid input between 1 to 4");
			}
		}while(choice!=4);
		sc.close();
		System.out.println("THANK YOU...VISIT AGAIN");
	}
}
