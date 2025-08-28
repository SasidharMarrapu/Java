package Multi_Threading;

public class DeadLock {
	final static String R1 = "Dead";
	final static String R2 = "Lock";
	public static void main(String[] args) {
		// Thread-1
		Thread t1 = new Thread() {
			public void run() {
				synchronized(R1) {
					System.out.println("Thread t1 is locked Resource R1");
					synchronized(R2) {
						System.out.println("Thread t1 is locked Resource R2");
					}
				}
			}
		};
		// Thread-2
		Thread t2 = new Thread() {
			public void run() {
				synchronized(R2) {
					System.out.println("Thread t2 is locked Resource R2");
					synchronized(R1) {
						System.out.println("Thread t2 is locked Resource R1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
