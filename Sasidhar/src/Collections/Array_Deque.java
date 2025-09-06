package Collections;

import java.util.*;

import encapsulation.online_store;
// it acts as a Queue and as a Stack
public class Array_Deque {
	public static void main(String[] args) {
		ArrayDeque aq = new ArrayDeque();
		// As a Queue
		aq.add('A');
		aq.offer('B');
		aq.offer('C');
		while(!aq.isEmpty()){
			System.out.println("poll(): "+aq.poll());
		}
		
		// As a Stack
		aq.push(10);;
		aq.push(20);
		aq.push(20);
		while(!aq.isEmpty()) {
			System.out.println("pop(): "+aq.pop());
		}
		// Methods
		aq.addFirst(60);
		aq.addLast(90);
		System.out.println(aq);
		System.out.println("Remove First "+aq.removeFirst());
		System.out.println("Remove Last "+aq.removeLast());
//		System.out.println(aq.remove());  throws exception if it is empty.
	}
}
