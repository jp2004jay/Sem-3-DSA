// Node class for representing individual elements in the circular linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Circular Linked list class with all the methods
class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    // Method to insert a node at the beginning of the circular linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = newNode; // Point to itself if the list is empty
        } else {
            newNode.next = head;
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
        }
        head = newNode;
    }

    // Method to insert a node at the end of the circular linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = newNode; // Point to itself if the list is empty
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    // Method to delete a node with specific data from the circular linked list
    public void delete(int data) {
        if (isEmpty()) {
            return;
        }

        Node current = head;
        Node prev = null;

        do {
            if (current.data == data) {
                if (prev != null) {
                    prev.next = current.next;
                    if (current == head) {
                        head = current.next;
                    }
                } else {
                    Node temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    temp.next = head.next;
                    head = head.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Method to print the circular linked list
    public void print() {
        if (isEmpty()) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}