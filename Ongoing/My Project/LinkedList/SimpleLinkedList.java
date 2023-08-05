class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		next = null;
	}
}

class LinkedList{
	Node head;
	int size;

	LinkedList(){
		head = null;
	}

	public boolean isEmpty(){
		return head == null;
	}

	public void insert(int data){
		Node newNode = new Node(data);

		Node current = head;
		Node pre = null;

		while(current != null && current.data <= data){
			pre = current;
			current = current.next;
		} 

		if(head == current){
			newNode.next = head;
			head = newNode;
		}
		else{
			pre.next = newNode;
			newNode.next = current;
		}
	}

	public void insertAtFirst(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtLast(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			head = newNode;
			return;
		}

		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void delete(int data){
		if(isEmpty()){
			System.out.println("LinkedList is Empty");
			return;
		}

		if(head.data == data){
			head = head.next;
			return;
		}

		Node current = head;
		Node pre = null;

		while(current != null && current.data != data){
			pre = current;
			current = current.next;
		}

		if(current != null){
			pre.next = current.next;
		}
		else{
			System.out.println(data+" is not Found!");
		}
	}

	public void printList(){
		Node current = head;
		System.out.print("\n[");
		while(current != null){
			if(current.next == null){
				System.out.print(current.data);
			}else{
				System.out.print(current.data + ", ");
			}
			current = current.next;
		}
		System.out.print("]\n");
	}
}

public class SimpleLinkedList{
	public static void main(String[] args){
		LinkedList list = new LinkedList();

		list.printList();
		
		list.insert(48);
		list.printList();

		list.insert(75);
		list.printList();

		list.insert(12);
		list.printList();

		list.insert(69);
		list.printList();

		list.insert(5);
		list.printList();
		
		list.delete(48);
		list.printList();
		
		list.delete(78);
		list.printList();
		
		list.delete(75);
		list.printList();

		list.insert(105);
		list.printList();

		list.insert(3);
		list.printList();
		list.insert(3);
		list.printList();
	}
}