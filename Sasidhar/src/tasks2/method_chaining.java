package tasks2;

public class method_chaining {
	public method_chaining show() {
		System.out.println("Show method");
		return this;
	}
	public method_chaining display() {
		System.out.println("Display method");
		return this;
	}
	public void printData() {
		System.out.println("Print data");
	}
	public static void main(String[] args) {
		new method_chaining().display().show().printData();
		}
}
