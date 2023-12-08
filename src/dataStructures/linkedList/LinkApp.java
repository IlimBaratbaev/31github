package dataStructures.linkedList;

public class LinkApp {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(22, 3.66);
        list.insertFirst(55, 8.93);
        list.insertFirst(34, 10.43);
        list.insertFirst(98, 2.21);
        list.displayList();
        while (!list.isEmpty()) {
            Link aLink = list.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println();
        }
        list.displayList();
    }
}
