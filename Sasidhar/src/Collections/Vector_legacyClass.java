package Collections;
import java.util.*;
public class Vector_legacyClass {
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(5);
		v.add(20);
		v.addElement(15);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
//		Iterator i = v.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
	}
}
