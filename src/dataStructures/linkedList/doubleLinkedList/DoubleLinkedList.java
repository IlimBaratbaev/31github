package dataStructures.linkedList.doubleLinkedList;

import dataStructures.linkedList.LinkF;

public class DoubleLinkedList {
    private LinkDouble first;
    private LinkDouble last;
    public DoubleLinkedList() {
        first = null;
        last = null;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(long data) {
        LinkDouble newLink = new LinkDouble(data);
        if (isEmpty()) {
            last = newLink;
        }
        else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    public void insertLast(long data) {
        LinkDouble newLink = new LinkDouble(data);
        if (isEmpty()) {
            first = newLink;
        }
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }
    public void displayList() {
        LinkDouble current = first;
        while (current != null) {
            current.displayData();
            current = current.next;
        }
        System.out.println();
    }
}
