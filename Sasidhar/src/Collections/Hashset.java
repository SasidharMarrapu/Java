package Collections;

import java.util.*;

public class Hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(null);
		hs.add(30); // Set not allows duplicates
		hs.add(50);
		hs.add(null); // Set accepts only one null value 
		
		System.out.println(hs);
		Iterator i = hs.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
