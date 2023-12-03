package dataStructures.stack.ex1;

public class StackApp {
    public static void main(String[] args) {
        StackLong stackX = new StackLong(10);
        stackX.push(30);
        stackX.push(50);
        stackX.push(70);
        stackX.push(100);
        while (!stackX.isEmpty()) {
            long value = stackX.pop();
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
