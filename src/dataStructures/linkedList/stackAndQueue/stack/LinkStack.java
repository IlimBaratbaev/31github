package dataStructures.linkedList.stackAndQueue.stack;

public class LinkStack {
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }
    public void push(long d) {
        theList.insertFirst(d);
    }
    public long pop() {
        return theList.deleteFirst();
    }
    public boolean isEmpty() {
        return theList.isEmpty();
    }
    public void displayStack() {
        System.out.print("Stack (top-->bottom: ");
        theList.displayList();
    }

}
