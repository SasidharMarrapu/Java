package Multi_Threading;

public class Thread_join extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);//pauses the current thread for given milliseconds.
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
		Thread_join t1 = new Thread_join();
		t1.setName("Thread1");
		t1.start();
		t1.join();//join()  makes one thread wait until another finishes.
		
		Thread_join t2 = new Thread_join();
		t2.setName("Thread2");
		t2.start();
		t2.join();
		
		Thread_join t3 = new Thread_join();
		t3.setName("Thread3");
		t3.start();
		t3.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
	}
}
