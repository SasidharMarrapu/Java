package abstraction;

abstract class Payment{
	abstract String initiatePayment();
	abstract String verifyPayment();
	public void generateTransactionId() {
		System.out.println("return Transaction id");
	}
}

class CreditCardPayment extends Payment{
	String initiatePayment(){return " Credit Card Payment Initiated";}
	String verifyPayment(){return " Credit Card Payment verified";}
}
class UPIpayment extends Payment{
	String initiatePayment(){return " UPI Payment Initiated";}
	String verifyPayment(){return " UPI Payment verified";}
}
class NetBanking extends Payment{
	String initiatePayment(){return " Payment Initiated";}
	String verifyPayment(){return " Payment verified";}
}


public class paymentMethod {

	public static void main(String[] args) {
		Payment card = new CreditCardPayment();
		System.out.println(card.initiatePayment());
		System.out.println(card.verifyPayment());
		card.generateTransactionId();
		
		Payment upi = new UPIpayment();
		System.out.println(upi.initiatePayment());
		System.out.println(upi.verifyPayment());
		upi.generateTransactionId();
		
		Payment net = new NetBanking();
		System.out.println(net.initiatePayment());
		System.out.println(net.verifyPayment());
		net.generateTransactionId();

	}

}
