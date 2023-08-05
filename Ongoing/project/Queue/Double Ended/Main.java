class DoubleEndedQueue {
    private Object[] deque;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public DoubleEndedQueue(int capacity) {
        this.capacity = capacity;
        this.deque = new Object[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = 0;
    }

    // Method to add an element to the front of the deque
    public void addFirst(Object element) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full.");
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        deque[front] = element;
        size++;
    }

    // Method to add an element to the rear of the deque
    public void addLast(Object element) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full.");
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        deque[rear] = element;
        size++;
    }






    public Object removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty.");
        }

        Object removedElement = deque[front];
        deque[front] = null;
        front = (front + 1) % capacity;
        size--;

        return removedElement;
    }

    public Object removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty.");
        }

        Object removedElement = deque[rear];
        deque[rear] = null;
        rear = (rear - 1 + capacity) % capacity;
        size--;

        return removedElement;
    }

    // Method to get the front element of the deque without removing it
    public Object peekFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty.");
        }

        return deque[front];
    }

    // Method to get the rear element of the deque without removing it
    public Object peekLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty.");
        }

        return deque[rear];
    }

    // Method to check if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the deque is full
    public boolean isFull() {
        return size == capacity;
    }
}