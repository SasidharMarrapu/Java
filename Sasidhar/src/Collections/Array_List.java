package Collections;

import java.util.*;

public class Array_List {
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(null);
		al.add(50);
		System.out.println(al);// printing all elements
		
		System.out.println(al.get(2));// get element by index
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println("Values: "+ al.get(i));
		}
	}
}
