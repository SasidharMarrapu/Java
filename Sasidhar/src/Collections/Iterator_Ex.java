package Collections;

import java.util.*;
public class Iterator_Ex {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Mango");
		al.add("Banana");
		al.add("Grapes");
		al.add("Apple");
		
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			String s = (String) i.next();
			System.out.println(s);
			if(s.equals("Apple")) {
				i.remove();
			}
		}
		System.out.println("After removing: "+al);
	}
}
