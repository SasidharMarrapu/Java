package Tasks;

public class terinary {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 30;
		int result = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Highest value is: "+result);

	}

}
