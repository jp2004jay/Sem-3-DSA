import java.util.EmptyStackException;

// Stack implementation using an array
class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    // Method to push an element onto the stack
    public void push(int data) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full. Cannot push more elements.");
        }

        arr[++top] = data;
    }

    // Method to pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return arr[top--];
    }

    // Method to peek the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return arr[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to get the current size of the stack
    public int size() {
        return top + 1;
    }
}