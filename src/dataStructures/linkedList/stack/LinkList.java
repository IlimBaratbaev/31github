package dataStructures.linkedList.stack;

import dataStructures.linkedList.twoWayLinkedList.Link;

public class LinkList {
    private LinkForStack first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        LinkForStack newLink = new LinkForStack(dd);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst() {
        LinkForStack temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList() {
        LinkForStack current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

}
