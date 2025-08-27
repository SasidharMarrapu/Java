package Multi_Threading;

class MyDaemon extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) { // .isDaemon() is used to check the Thread is Daemon or not....
            System.out.println("Daemon thread is running...");
        } else {
            System.out.println("User thread is running...");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try { 
            	Thread.sleep(1000);
            	}
            catch (Exception e) {
            	System.out.println("Exception occured");
            }
        }
    }
}

public class Daemon_Thread_Ex {
    public static void main(String[] args) {
        MyDaemon t1 = new MyDaemon();
        MyDaemon t2 = new MyDaemon();

        t1.setDaemon(true); // set as daemon
        t1.start();
        t1.setName("Thread1");

        t2.start();
        t2.setName("Thread2");
    }
}

