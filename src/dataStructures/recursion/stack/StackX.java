package dataStructures.recursion.stack;

public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public StackX(int max) {
        maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int element) {
        stackArray[++top] = element;
    }
    public int pop() {
        return stackArray[top--];
    }
    public int peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
