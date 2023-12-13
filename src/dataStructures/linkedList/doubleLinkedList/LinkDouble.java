package dataStructures.linkedList.doubleLinkedList;

public class LinkDouble {
    public long dData;
    public LinkDouble next;
    public LinkDouble previous;
    public LinkDouble(long data) {
        dData = data;
        next = null;
        previous = null;
    }
    public void displayData() {
        System.out.print(dData + " ");
    }
}
