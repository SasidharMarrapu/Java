package Collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(101, "A");
		hm.put(102, "B");
		hm.put(103, "C");
		hm.put(104, "D");
		System.out.println(hm.get(103));
		Iterator i = hm.keySet().iterator();
		// KeySet() is used to read all the keys and stores as a Array.
		while(i.hasNext()) {
			System.out.println("Values: "+hm.get(i.next()));
		}
		// entryset() is to access both keys and values
		Iterator j = hm.entrySet().iterator();
		while(j.hasNext()) {
			Map.Entry entry = (Entry)j.next();
			System.out.println("Key: "+entry.getKey() + " Value: "+entry.getValue());
		}
	}
}
