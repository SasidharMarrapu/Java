package Collections;

import java.util.*;

public class Treeset {
	public static void main(String[] args) {
		// TreeSet automatically sort the data
		TreeSet ts = new TreeSet();
		ts.add('a');
		ts.add('d');
		ts.add('b');
		ts.add('c');  
		System.out.println(ts);
		
		Iterator i = ts.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
