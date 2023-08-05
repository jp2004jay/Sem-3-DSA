import queueProject.CircularQueue;

public class CircularQueueDemo{
	public static void main(String[] args){
		CircularQueue queue = new CircularQueue(5);
		queue.enqueue(4);
		queue.printQueue();

		queue.enqueue(48);
		queue.printQueue();

		queue.enqueue(23);
		queue.printQueue();
		System.out.println("PEEK: "+ queue.peek());

		queue.enqueue(15);
		queue.printQueue();

		System.out.println("DELETE: "+queue.dequeue());
		queue.printQueue();

		queue.dequeue();
		queue.printQueue();
		System.out.println("PEEK: "+ queue.peek());

		queue.enqueue(105);
		queue.printQueue();
		System.out.println("PEEK: "+ queue.peek());

		queue.enqueue(158);
		queue.printQueue();

		queue.enqueue(16);
		queue.printQueue();
		System.out.println("PEEK: "+ queue.peek());


		queue.dequeue();
		queue.printQueue();
		System.out.println("PEEK: "+ queue.peek());
	}
}