package dataStructures.linkedList.doubleLinkedList;

public class DoublyLinkedApp {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(12);
        list.insertFirst(56);
        list.insertFirst(54);
        list.insertLast(109);
        list.insertLast(34);
        list.insertLast(23);
        list.displayBackwards();
        list.displayForward();
        list.deleteFirst();
        list.deleteLast();
        list.deleteKey(109);
        list.displayForward();
        list.insertAfter(12, 133);
        list.displayForward();
    }
}
