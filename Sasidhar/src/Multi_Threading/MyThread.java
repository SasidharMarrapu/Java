package Multi_Threading;

// Creating Thread by Extending Thread class
public class MyThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i < 5; i++) {
			System.out.println("Values: "+i);
		}
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("My Thread1");
		t1.start();
		MyThread t2 = new MyThread();
		t2.setName("My Thread2");
		t2.start();
		// in this We have Thread Interference and Data Inconsistency problems
	}
}
