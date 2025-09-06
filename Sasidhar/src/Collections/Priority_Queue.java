package Collections;

import java.util.*;

public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.offer(10);
		p.offer(20);
		p.offer(40);
		p.add(30);
		System.out.println("Peek(): "+p.peek());// retrieves first element
		Iterator i = p.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		while(!p.isEmpty()) {
			System.out.println("poll(): "+p.poll()); // remove the data
		}
	}
}
