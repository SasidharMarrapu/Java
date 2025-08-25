package tasks2;

public class spaces {
	public static void main(String[] args) {
		String s = "S   a    s      i";
		String result = "";
		boolean spacefound = false;
		
		for(int i=0; i< s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch != ' ') {
				result += ch;
				spacefound = false;
			}
			else {
				if(!spacefound) {
					result += " ";
					spacefound = true;
				}
			}
		}
		System.out.println("Original String: "+s);
		System.out.println("After removing spaces: "+result);
	}
}
