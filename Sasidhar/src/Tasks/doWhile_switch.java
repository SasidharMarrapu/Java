package Tasks;
import java.util.Scanner;
public class doWhile_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int subchoice = 0;
		String cart[] = new String[20];
		int cartCount = 0;
		
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
				System.out.println("1.Dairy Milk");
				System.out.println("2.Kit Kat");
				System.out.println("3.5-Star");
				System.out.println("Select your choice: ");
				subchoice = sc.nextInt();
				
				if(cartCount < cart.length) {
				switch(subchoice) {
				case 1 -> cart[cartCount++]="DairyMilk";
				case 2 -> cart[cartCount++]="Kit Kat";
				case 3 -> cart[cartCount++]="5-Star";
				default -> System.out.println("Enter Chocolate Choice correctly");
				}
				}
				else
					System.out.println("Your cart is full.....");
	
			}
			case 2 -> {
				System.out.println("You selected CoolDrinks");
				System.out.println("Available CoolDrinks...");
	            System.out.println("1.Coca-Cola");
	            System.out.println("2.Sprite");
	            System.out.println("3.Maaza");
	            System.out.print("Select your CoolDrink: ");
	            subchoice = sc.nextInt();
	            
	            if(cartCount < cart.length) {
	            switch(subchoice) {
	            case 1 -> cart[cartCount++]="Coca-Cola";
				case 2 -> cart[cartCount++]="Sprite";
				case 3 -> cart[cartCount++]="Maaza";
	            default -> System.out.println("Enter CoolDrink Choice correctly");
	            }}
	            else
	            	System.out.println("Your cart is full...");

			}
			
			case 3 -> {
				System.out.println("You selected IceCreams");
				System.out.println("Available IceCreams...");
	            System.out.println("1.Vanilla");
	            System.out.println("2.Butterscotch");
	            System.out.println("3.Strawberry");
	            System.out.print("Select your Ice Cream: ");
	            subchoice = sc.nextInt();
	            
	            if(cartCount < cart.length) {
	            switch(subchoice) {
	            case 1 -> cart[cartCount++]="Vanilla";
				case 2 -> cart[cartCount++]="ButterScotch";
				case 3 -> cart[cartCount++]="Strawberry";
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
						System.out.println("- "+cart[i]);
					}
				}
			}
			default -> System.out.println("Enter valid input between 1 to 4");
			}
		}while(choice!=4);
		sc.close();
		System.out.println("THANK YOU...VISIT AGAIN");
	}
}
