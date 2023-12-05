package dataStructures.stackAndQueues.stack;

public class StackLong {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackLong(int size) {
        maxSize = size;
        stackArray = new long[size];
        top = -1;
    }

    public void push(long element) {
        stackArray[++top] = element;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
