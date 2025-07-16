package Tasks;

public class guest {

	public void read(){
        System.out.println("Reading mode");     
	}
	public void write() {
		System.out.println("Writing mode");
	}
	public void manage() {
		System.out.println("Manage code");
	}

public static void main(String args[]) {
	guest g = new guest();
	g.read();
	g.write();
	g.manage();
}
}