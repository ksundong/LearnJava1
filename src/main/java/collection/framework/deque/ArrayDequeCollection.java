package collection.framework.deque;

import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeCollection {
	public static void main(String[] args) {
		Deque<String> deq = new LinkedList<>(); // new LinkedList instance
		
		// First offer
		deq.offerFirst("1.Box");
		deq.offerFirst("2.Toy");
		deq.offerFirst("3.Robot");
		
		// First poll
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}
}
