package Multi_Threading;

//** Object-Level Locking Using Synchronized Keyword **
class BankAccount{
	int balance = 1000;
	
	public synchronized void withdraw(int amount) {
		if(balance >= amount) {
			System.out.println(Thread.currentThread().getName()+" is withdrawing "+amount+" amount");
			balance -= amount;
			System.out.println("Remaining balance is "+balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+" Insufficient balance "+balance);
		}
	}
}
// Thread class
class User extends Thread{
	BankAccount acc;
	User(BankAccount acc){
		this.acc = acc;
	}
	public void run() {
		acc.withdraw(600);
	}
}
public class synchronize_keyword {
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		User t1 = new User(obj);
		User t2 = new User(obj);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
}
