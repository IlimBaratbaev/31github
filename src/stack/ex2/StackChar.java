package stack.ex2;

public class StackChar {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackChar(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char ch) {
        stackArray[++top] = ch;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
