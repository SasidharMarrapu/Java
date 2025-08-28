package Multi_Threading;

class Items{
	int count = 1000;
	synchronized void consume(int cnt) {
		System.out.println("Items: "+ this.count);
		System.out.println("Consumer is going to consume "+cnt);
		
		if(this.count < cnt) {
			System.out.println("Waiting for produce");
			try {
				//Thread.sleep(10000);
				wait();
			}
			catch(Exception e) {}
		}
		this.count = count - cnt;
		System.out.println("Consume completed");
		System.out.println("Current: "+this.count);
	}
	synchronized void produce(int cnt) {
		this.count = count + cnt;
		System.out.println("Current: "+this.count);
		System.out.println("Produce completed");
		notify();
	}
}
// Thread-1
class consumer extends Thread{
	Items pt;
	consumer(Items pt){
		this.pt = pt;
	}
	public void run() {
		pt.consume(1500);
	}
}
// Thread-2
class producer extends Thread{
	Items pt;
	producer(Items pt){
		this.pt = pt;
	}
	public void run() {
		pt.produce(800);
	}
}
public class Producer_Consumer {
	public static void main(String[] args) {
		Items obj = new Items();
		consumer t1 = new consumer(obj);
		producer t2 = new producer(obj);
		t1.start();
		t2.start();
	}
}
