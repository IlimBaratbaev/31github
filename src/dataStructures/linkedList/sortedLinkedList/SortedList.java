package dataStructures.linkedList.sortedLinkedList;


import dataStructures.linkedList.LinkF;

public class SortedList {
    private LinkF first;
    public SortedList() {
        first = null;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void insert(long key) {
        LinkF newLink = new LinkF(key);
        LinkF previous = null;
        LinkF current = first;
        while (current != null && key > current.dData) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newLink;
        }
        else {
            previous.next = newLink;
        }
        newLink.next = current;
    }
    public LinkF remove() {
        LinkF temp = first;
        first = first.next;
        return temp;
    }
    public void displayList() {
        System.out.print("List (first-->last): ");
        LinkF current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
