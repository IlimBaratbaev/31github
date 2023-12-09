package dataStructures.linkedList.twoWayLinkedList;

public class FirstLastApp {
    public static void main(String[] args) {
        FirstLastList theList = new FirstLastList();
        theList.insertFirst(11);
        theList.insertFirst(77);
        theList.insertFirst(85);

        theList.insertLast(45);
        theList.insertLast(67);
        theList.insertLast(7);

        theList.displayList();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.displayList();
    }
}
