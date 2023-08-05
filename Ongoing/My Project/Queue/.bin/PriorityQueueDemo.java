import queueProject.PriorityQueue;

class PriorityQueueDemo{
	public static void main(String[] args){
		PriorityQueue queue = new PriorityQueue();
		queue.enqueue(25);
		queue.printQueue();

		queue.enqueue(75, 1);
		queue.printQueue();

		queue.enqueue(56, 1);
		queue.printQueue();

		queue.enqueue(68, 2);
		queue.printQueue();

		queue.dequeue();
		queue.printQueue();

		queue.dequeue(1);
		queue.printQueue();

		queue.dequeue(1);
		queue.printQueue();

		queue.dequeue(1);
		queue.printQueue();

		queue.dequeue();
		queue.printQueue();

		queue.enqueue(75, 1);
		queue.printQueue();

		queue.enqueue(56, 1);
		queue.printQueue();

		queue.printQueue(1);
		queue.printQueue(2);


		queue.enqueue(2, 3);
		queue.printQueue();


		queue.enqueue(8, 3);
		queue.printQueue();


		queue.enqueue(56, 3);
		queue.printQueue();


		queue.printQueue(3);

		queue.dequeue();
		queue.printQueue();


		queue.dequeue(2);
		queue.printQueue();


		queue.dequeue(3);
		queue.printQueue();


		queue.dequeue(1);
		queue.printQueue();


		queue.dequeue(3);
		queue.printQueue();


		queue.dequeue(1);
		queue.printQueue();

		
		queue.dequeue(3);
		queue.printQueue();


		queue.dequeue(1);
		queue.printQueue();
	}
}