import queueProject.SimpleQueue;

public class SimpleQueueDemo{
	public static void main(String[] args){
		SimpleQueue queue = new SimpleQueue(5);
		queue.enqueue(4);
		queue.printQueue();

		queue.enqueue(7);
		queue.printQueue();
		System.out.println("PEEK: "+queue.peek());

		queue.enqueue(23);
		queue.printQueue();
		queue.reverse();
		

		queue.dequeue();
		queue.printQueue();
		System.out.println("PEEK: "+queue.peek());
	
		
		queue.dequeue();
		queue.printQueue();

		queue.enqueue(58);
		queue.printQueue();
		System.out.println("PEEK: "+queue.peek());
	

		queue.enqueue(6);
		queue.printQueue();

		queue.enqueue(9);
		queue.printQueue();


		queue.dequeue();
		queue.printQueue();


		queue.dequeue();
		queue.printQueue();


		queue.dequeue();
		queue.printQueue();
		
		queue.dequeue();
		queue.printQueue();
		System.out.println("PEEK: "+queue.peek());
	}
}