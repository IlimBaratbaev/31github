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
    public LinkDouble deleteFirst() {
        LinkDouble temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }
    public LinkDouble deleteLast() {
        LinkDouble temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }
    public boolean insertAfter(long key, long data) {
        LinkDouble current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        LinkDouble newLink = new LinkDouble(data);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        }
        else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public LinkDouble deleteKey(long key) {
        LinkDouble current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == first)
            first = current.next;
        else
            current.previous.next = current.next;
        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        LinkDouble current = first;
        while (current != null) {
            current.displayData();
            current = current.next;
        }
        System.out.println();
    }
    public void displayBackwards() {
        System.out.print("List (last-->first): ");
        LinkDouble current = last;
        while (current != null) {
            current.displayData();
            current = current.previous;
        }
        System.out.println();
    }
}
