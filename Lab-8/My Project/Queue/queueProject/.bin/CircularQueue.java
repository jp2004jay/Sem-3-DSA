package queueProject;
public class CircularQueue{
	int front;
	int rare;
	int[] queue;
	int size;

	public CircularQueue(int size){
		queue = new int[size];
		front = 0;
		rare = -1;
		this.size = 0;
	}

	public void enqueue(int number){
		if(isFull()){
			System.out.println("Queue is Full");
		}
		else{
			if(rare == queue.length-1){
				rare = -1;
			}
			queue[++rare] = number;
			size++;
		}
	}

	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return 0;
		}
		else{
			if(front == queue.length-1){
				int tempVar = queue[front];
				front = 0;
				queue[queue.length-1] = 0;
				size--;
				return tempVar;
			}

			int temp = queue[front];
			queue[front] = 0;
			front++;
			size--;
			return temp;
		}
	}

	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is Full");
			return 0;
		}
		else{
			return queue[front];
		}
	}

	public boolean isEmpty(){
		return (size == 0);
	}

	public boolean isFull(){
		return (size == queue.length);
	}

	public void printQueue(){
		System.out.print("\n[");
		for(int temp : queue){
			if(temp == 0){
				continue;
			}
			System.out.print(temp+", ");
		}
		System.out.print("]\n");
	}
}