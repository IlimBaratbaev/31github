package dataStructures.linkedList.stackAndQueue.queue;

import dataStructures.linkedList.LinkF;

public class FirstLastList {
    private LinkF first;
    private LinkF last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertLast(long j) {
        LinkF newLink = new LinkF(j);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
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
