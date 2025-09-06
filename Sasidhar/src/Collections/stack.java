package Collections;

import java.util.*;

public class stack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(40);
		s.push(30);
		
		System.out.println(s);
		System.out.println("pop "+s.pop()); // Removes last element
		System.out.println(s.peek()); // Retrieves first element
		System.out.println(s.search(40)); // search element in the stack
		
		System.out.println();
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
