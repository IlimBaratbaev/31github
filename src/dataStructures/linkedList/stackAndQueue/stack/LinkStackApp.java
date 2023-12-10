package dataStructures.linkedList.stackAndQueue.stack;

public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();

        linkStack.push(20);
        linkStack.push(50);

        linkStack.displayStack();
        linkStack.push(88);
        linkStack.push(45);
        linkStack.displayStack();

        linkStack.pop();
        linkStack.pop();
        linkStack.displayStack();
    }
}
