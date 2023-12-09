package dataStructures.linkedList.simpleLinkedList;

public class LinkApp {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(22, 3.66);
        list.insertFirst(55, 8.93);
        list.insertFirst(34, 10.43);
        list.insertFirst(98, 2.21);
        list.displayList();
        LinkWithId f = list.find(55);
        if (f != null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Couldn't found link");
        LinkWithId d = list.delete(98);
        if (d != null)
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Couldn't delete link");
        list.displayList();
    }
}
