// Node class for representing individual elements in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked list class with all the methods
class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to insert a node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }









    // Method to remove a node with a specific data from the linked list
    public void delete(int data) {
        if (isEmpty()) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
        }
    }

    // Method to print the linked list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}