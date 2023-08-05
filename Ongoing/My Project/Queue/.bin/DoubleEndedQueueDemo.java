import queueProject.DoubleEndedQueue;

public class DoubleEndedQueueDemo{
	public static void main(String[] args){
		DoubleEndedQueue queue = new DoubleEndedQueue(5);

		queue.enqueueLast(48);
		queue.printQueue();

		queue.enqueueLast(75);
		queue.printQueue();

		queue.enqueueLast(37);
		queue.printQueue();
		System.out.println("PEEKLAST: "+queue.peekLast());

		queue.enqueueLast(12);
		queue.printQueue();

		queue.enqueueLast(5);
		queue.printQueue();

		queue.enqueueLast(78);
		queue.printQueue();

		System.out.println("DELETEFIRST: "+queue.dequeueFirst());
		queue.printQueue();
		System.out.println("PEEKFIRST: "+queue.peekFirst());


		System.out.println("DELETELAST: "+queue.dequeueLast());
		queue.printQueue();

		queue.enqueueFirst(55);
		queue.printQueue();

		queue.reverse();
	}
}