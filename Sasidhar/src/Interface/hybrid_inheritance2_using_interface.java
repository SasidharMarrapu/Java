package Interface;

interface Account{
	public void account_details();
}
interface Loan{
	public void loan_details();
}
interface CustomerService extends Account,Loan{
	public void get_data();
}
class Bank implements CustomerService{
	public void account_details() {
		System.out.println("getting Account details");
	}
	public void loan_details() {
		System.out.println("getting Loan details");
	}
	public void get_data() {
		System.out.println("Customer will get the details");
	}
}
public class hybrid_inheritance2_using_interface {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.account_details();
		b.loan_details();
		b.get_data();
	}
}
