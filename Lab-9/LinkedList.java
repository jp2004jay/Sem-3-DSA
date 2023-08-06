public class LinkedList{
	Node head;

	public LinkedList(){
		head = null;
	}

	public void insertFirst(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertLast(int data){
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

	public void deleteFirst(){
		if(head == null){
			System.out.println("LinkedList is Empty");
			return;
		}
		head = head.next;
	}

	public void deleteLast(){
		if(head == null){
			System.out.println("LinkedList is Empty");
			return;
		}
		Node current = head;
		Node pre = null;
		while(current.next != null){
			pre = current;
			current = current.next;
		}
		if(pre == null){
			head = null;
			return;
		}
		pre.next = current.next;
	}

	public void deleteSpecific(int position){
		if(head == null){
			System.out.println("LinkedList is Empty");
			return;
		}
		if(position <= 0){
			System.out.println("Position must be greter than 0.");
			return;
		}
		int tempPos = 1;
		Node current = head;
		Node pre = null;
		while(current.next != null && tempPos != position){
			pre = current;
			current = current.next;
			tempPos++;
		}
		if(tempPos == position){
			if(position == 1){
				head = current.next;
				return;
			}
			pre.next = current.next;
		}
		else{
			System.out.println("Node not found at your specific position");
		}
	}

	public void display(){
		if(head == null){
			System.out.println("LinkedList is Empty");
			return;
		}
		Node current = head;
		System.out.print("\n[");
		while(true){
			if(current.next == null){
				System.out.print(current.data+"]\n");
				break;
			}
			System.out.print(current.data+", ");
			current = current.next;
		}
	}
}