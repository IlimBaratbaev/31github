package dataStructures.linkedList.sortedLinkedList;

import dataStructures.linkedList.sortedLinkedList.SortedList;

public class SortedListApp {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.insert(10);
        sortedList.insert(34);
        sortedList.insert(50);
        sortedList.displayList();
        sortedList.insert(99);
        sortedList.insert(78);
        sortedList.insert(45);
        sortedList.remove();
        sortedList.displayList();
    }
}
