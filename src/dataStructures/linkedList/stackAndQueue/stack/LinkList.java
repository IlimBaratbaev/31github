package dataStructures.linkedList.stackAndQueue.stack;

import dataStructures.linkedList.stackAndQueue.LinkF;

public class LinkList {
    private LinkF first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        LinkF newLink = new LinkF(dd);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst() {
        LinkF temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList() {
        LinkF current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

}
