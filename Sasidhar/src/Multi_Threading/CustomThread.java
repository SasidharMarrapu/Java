package Multi_Threading;

// Creating Thread using Runnable Interface
public class CustomThread implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i< 5; i++) {
			System.out.println("Values: "+i);
		}
	}
	public static void main(String[] args) {
		CustomThread obj = new CustomThread();
		Thread t1 = new Thread(obj);
		t1.setName("Custom Thread");
		t1.start();
	}

}
