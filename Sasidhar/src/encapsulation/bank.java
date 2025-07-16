package encapsulation;

class bankAccount{
	private double balance;
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}

public class bank {
	public static void main(String args[]) {
		bankAccount ac = new bankAccount();
		ac.deposit(1500);
		ac.withdraw(1200);
		System.out.println(ac.getBalance());
	}

}
