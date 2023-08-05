package queueProject;

public class PriorityQueue{
	Node head;

	public PriorityQueue(){
		head = null;
	}

	public void enqueue(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
			return;
		}

		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}

	public void enqueue(int data, int p){
		if(p<=0){
			System.out.println("Priority Must be Gretar than 0");
			return;
		}

		Node newNode = new Node(data);
		newNode.p = p;

		if(head == null){
			head = newNode;
		}
		else{
			Node current = head;
			Node pre = null;
			while(current.p <= p){
				pre = current;
				if(current.next == null){
					pre.next = newNode;
					return;
				}
				current = current.next;
			}
			if(pre == null){
				head = newNode;
				newNode.next = current;
			}
			else{
				pre.next = newNode;
				newNode.next = current;
			}
		}
	}

	public void dequeue(){
		if(head == null){
			System.out.println("Queue is Empty");
		}
		else{
			Node current = head;
			Node pre = null;
			while(current.p != 1000){
				pre = current;
				if(current.next == null){
					return;
				}
				current = current.next;
			}
			pre.next = current.next;
		}
	}

	public void dequeue(int p){
		if(p<=0){
			System.out.println("Priority Must be Gretar than 0");
			return;
		}

		if(head == null){
			System.out.println("Queue is Empty");
		}
		else{
			Node current = head;
			Node pre = null;

			while(current.p < p){
				pre = current;
				current = current.next;
			}
			if(pre == null){
				if(current.p == p){
					head = current.next;
				}
				else{
					return;
				}
				
			}else{
				pre.next = current.next;
			}
		}
	}

	public void printQueue(){
		Node current = head;
		System.out.print("\n[");
		while(current != null){
			System.out.print(current.data+", ");
			current = current.next;
		}
		System.out.print("]\n");
	}

	public void printQueue(int p){
		Node current = head;
		while(current.p < p){
			current = current.next;
		}

		System.out.print("\n[");
		while(current.p == p){
			System.out.print(current.data+", ");
			if(current.next == null){
				System.out.print("]\n");
				return;
			}
			current = current.next;
		}
		System.out.print("]\n");
	}
}