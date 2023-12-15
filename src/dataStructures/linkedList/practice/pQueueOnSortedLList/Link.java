package dataStructures.linkedList.practice.pQueueOnSortedLList;

public class Link {
    private long data;
    private Link next;
    public Link(long data) {
        this.data = data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public long getData() {
        return data;
    }

    public Link getNext() {
        return next;
    }
    public void displayData() {
        System.out.print(data + " ");
    }
}
