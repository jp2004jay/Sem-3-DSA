class CircularQueue {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(Object element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object removedElement = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        return removedElement;
    }

    // Method to get the front element of the circular queue without removing it (peek)
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue[front];
    }

    // Method to check if the circular queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to check if the circular queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the current size of the circular queue
    public int size() {
        return size;
    }
}