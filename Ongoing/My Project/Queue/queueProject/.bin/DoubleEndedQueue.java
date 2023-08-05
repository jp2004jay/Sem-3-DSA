package queueProject;
public class DoubleEndedQueue{
	int first;
	int rare;
	int size;
	int[] queue;

	public DoubleEndedQueue(int size){
		queue = new int[size];
		this.size = 0;
		first = 0;
		rare = -1;
	}

	public void enqueueLast(int number){
		if(isFull()){
			System.out.println("Queue is Full");
		}
		else if(rare == queue.length-1 && first !=0){
			System.out.println("Back Side of Queue is Full \nPlease Insert at Front");
		}
		else{
			queue[++rare] = number;
			size++;
		}
	}

	public int dequeueFirst(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return 0;
		}
		else{
			size--;
			return queue[first++];
		}
	}

	public void enqueueFirst(int number){
		if(isFull()){
			System.out.println("Queue is Full");
		}
		else if(first == 0 && rare != queue.length-1){
			System.out.println("Front Side of Queue is Full \nPlease Insert at Last");
		}
		else{
			queue[--first] = number;
			size++;
		}
	}

	public int dequeueLast(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return 0;
		}
		else{
			size--;
			return queue[rare--];
		}
	}

	public int peekFirst(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return 0;
		}
		else{
			return queue[first];
		}
	}

	public int peekLast(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return 0;
		}
		else{
			return queue[rare];
		}
	}

	public boolean isFull(){
		return (size == queue.length);
	}

	public boolean isEmpty(){
		return (size == 0);
	}

	public void printQueue(){
		System.out.print("\n[");
		for(int i=first; i<=rare; i++){
			System.out.print(queue[i] + ", ");
		}
		System.out.print("]\n");
	}

	public void reverse(){
		int dec = 0;
		for(int i=first; i<=rare/2; i++){
			int temp = queue[i];
			queue[i] = queue[rare-dec];
			queue[rare-dec] = temp;
			dec++;
		}
		printQueue();
	}
}