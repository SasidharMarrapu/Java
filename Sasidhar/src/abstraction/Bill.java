package abstraction;

abstract class ElectricityBill
{
	int consumerno;
	int units;
	float price;
	ElectricityBill(int consumerno, int units){
		this.consumerno = consumerno;
		this.units = units;
	}
	public abstract void billGeneration();
	public void reciept() {
		System.out.println("Consumer no: "+consumerno);
		System.out.println("Units: "+units);
		System.out.println("Bill Amount: "+price);
	}
}
class Domestic extends ElectricityBill{
	Domestic(int cno,int units){
		super(cno,units);
	}
	public void billGeneration() {
		price = units*2;
		reciept();
	}
}
class Commercial extends ElectricityBill{
	Commercial(int cno, int units){
		super(cno,units);
	}
	public void billGeneration() {
		price = units*5;
		reciept();
	}
}
//Service Class
class ElectricityService{
	ElectricityBill obj;
	ElectricityService(ElectricityBill e){
		obj = e;
	}
	public void process_payment() {
		obj.billGeneration();
	}
}
public class Bill {
	public static void main(String[] args) {
		Domestic d = new Domestic(1234,10);
		ElectricityService e = new ElectricityService(d);
		e.process_payment();
		Commercial c = new Commercial(4567,50);
		ElectricityService e1 = new ElectricityService(c);
		e1.process_payment();
	}
}
