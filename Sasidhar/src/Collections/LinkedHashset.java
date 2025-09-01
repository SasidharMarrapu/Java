package Collections;

import java.util.*;

public class LinkedHashset {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add('a');
		lhs.add('c');
		lhs.add('d');
		lhs.add('b');
		lhs.add(null);
		lhs.add(10);
		System.out.println(lhs);
		
		Iterator i = lhs.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
