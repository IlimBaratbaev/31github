package dataStructures.linkedList.sortedLinkedList;

import dataStructures.linkedList.LinkF;

public class ListInsertionApp {
    public static void main(String[] args) {
        int size = 10;
        LinkF[] linkArray = new LinkF[size];
        for (int i = 0; i < size; i++) {
            int n = (int) (java.lang.Math.random() * 99);
            LinkF newLink = new LinkF(n);
            linkArray[i] = newLink;
        }
        System.out.print("Unsorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(linkArray[i].dData + " ");
        }
        System.out.println();
        SortedList sortedList = new SortedList(linkArray);
        for (int i = 0; i < size; i++) {
            linkArray[i] = sortedList.remove();
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(linkArray[i].dData + " ");
        }
    }
}
