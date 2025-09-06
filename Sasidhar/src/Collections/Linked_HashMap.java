package Collections;

import java.util.*;
import java.util.Map.Entry;
public class Linked_HashMap {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1, "A");
		lhm.put(4, "B");
		lhm.put(3, "C");
		lhm.put(2, "D");
		lhm.put(null, "F");
		System.out.println(lhm);
		
		Iterator j = lhm.keySet().iterator();
		while(j.hasNext()) {
			System.out.println("Values: "+lhm.get(j.next()));
		}
		
		Iterator i = lhm.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry entry = (Entry) i.next();
			System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
		}
	}
}
