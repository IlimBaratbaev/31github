package dataStructures.linkedList.doubleLinkedList;

public class DoubleLinkedListApp {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(12);
        list.insertFirst(56);
        list.insertFirst(54);
        list.insertFirst(23);
        list.displayList();
    }
}
