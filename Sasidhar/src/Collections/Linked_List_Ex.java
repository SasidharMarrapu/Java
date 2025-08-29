package Collections;

import java.util.*;

public class Linked_List_Ex {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add("Dragon");
		l.add(30);
		l.add("Apple");
		
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		// Backward Direction
		System.out.println("Backward Direction");
		Iterator j = l.descendingIterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
	}
}
