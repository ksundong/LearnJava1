package collection.framework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>(); // create LinkedList<E> Instance
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");
		
		// next peek
		System.out.println("next: " + que.peek());
		
		// first, second instance poll
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		// what's next?
		System.out.println("next: " + que.peek());
		
		// Last instance poll
		System.out.println(que.poll());
	}
}
