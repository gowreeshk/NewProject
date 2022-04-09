package bye;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Collection_Interface_priorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq= new PriorityQueue();
		pq.add("hello");
		pq.offer("hell");
		pq.offer("home");
		pq.offer("come");
		pq.offer("horn");
		pq.offer("doing");
		
		System.out.println(pq);
		
		System.out.println(pq.element());
		System.out.println(pq.peek());
		
		System.out.println(pq.poll());
		
		Iterator itr=pq.iterator();
		while (itr.hasNext()) {
			 System.out.println(itr.next());
			
		}
	}

}
