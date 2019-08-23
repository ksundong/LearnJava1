package collection.framework.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCollection {
	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>();
		
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
