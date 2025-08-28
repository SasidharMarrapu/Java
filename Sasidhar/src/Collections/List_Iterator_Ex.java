package Collections;

import java.util.*;

public class List_Iterator_Ex {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Mango");
		al.add("Banana");
		al.add("Grapes");
		al.add("Apple");
		
		ListIterator<String> li = al.listIterator();
		// Forward Direction
		while(li.hasNext()) {
			String s = (String) li.next();
			if(s.equals("Banana")) {
				li.add("Watermelon");
			}
			if(s.equals("Apple")) {
				li.remove();
			}
		}
		System.out.println(al);
		// Backward Direction
		System.out.println("Backward Direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
//		ListIterator<String> l = al.listIterator(1);// we can give index value to execute from there
//		while(l.hasNext()) {
//			System.out.println(l.next());
//		}
	}
}
