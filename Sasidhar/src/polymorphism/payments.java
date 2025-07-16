package polymorphism;

class payment{
	int paymentAmount;
	
	void processPayment(){
		System.out.println(" Your payment is proccessed");
	}
}

class UPIpayment extends payment{
	int UPIid;
	void processPayment() {
		System.out.println("Upi Id: " + UPIid +", amount: "+ paymentAmount + ", Payment Confirm");
	}
}

class CardPayment extends payment{
	int cardnumber;
	String cardHolderName;
	void processPayment(){
		System.out.println("Cardnumber: "+cardnumber +", Name: "+ cardHolderName +", amount: " +paymentAmount + ", Payment Confirm");
	}
}

class WalletPayment extends payment{
	int walletId;
	void processPayment() {
		System.out.println("WalletId: "+walletId +", amount: "+ paymentAmount + ", Payment Confirm");
	}
}


public class payments {

	public static void main(String[] args) {
		
		UPIpayment upi = new UPIpayment();
        upi.UPIid = 12345;
        upi.paymentAmount = 500;
        upi.processPayment();

		CardPayment card = new CardPayment();
		card.cardnumber = 70691135;
		card.cardHolderName = "Sasidhar";
		card.paymentAmount = 2500;
		card.processPayment();
		
		WalletPayment wallet = new WalletPayment();
		wallet.walletId = 5333256;
		wallet.paymentAmount = 3000;
		wallet.processPayment();
		
	}

}
