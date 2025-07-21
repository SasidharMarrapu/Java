package Tasks;

public class task_ternaryOperator {

	public static void main(String[] args) {
		boolean isLoggedIn = true;
		String userType = "viewer";
		String subscriptionStatus = "expired" ;
		
		String msg = !isLoggedIn ? "Please log in to continue" : 
			userType.equals("admin") ? "welcome admin" : userType.equals("creator") ? 
					(subscriptionStatus.equals("active") ? "create dashboard" : 
						subscriptionStatus.equals("expired") ? "renew the subscription" :
							"access denied"): userType.equals("viewer") ?
								(subscriptionStatus.equals("active")? "Continue watching" :
									subscriptionStatus.equals("expired") ? "Subscription Expired" 
											: "Access Denied") : "Access denied";
		System.out.println("Message: " + msg);

	}

}
