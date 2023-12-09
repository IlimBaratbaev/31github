package dataStructures.linkedList.simpleLinkedList;

public class LinkList {
    private LinkWithId first;
    public LinkList() {
        first = null;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(int id, double dd) {
        LinkWithId newLinkWithId = new LinkWithId(id, dd);
        newLinkWithId.next = first;
        first = newLinkWithId;
    }
    public LinkWithId deleteFirst() {
        LinkWithId temp = first;
        first = first.next;
        return temp;
    }
    public void displayList() {
        System.out.print("List (first--> =last): ");
        LinkWithId current = first;
        while(current != null) {
            current.displayLinkWithId();
            current = current.next;
        }
        System.out.println();
    }
    public LinkWithId find(int key) {
        LinkWithId current = first;
        while (current.iData != key) {
            if (current.next == null ){
                return null;
            }
            else {
                current = current.next;
            }
        }
        return current;
    }
    public LinkWithId delete(int key) {
        LinkWithId previous = first, current = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            }
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else {
            previous.next = current.next;
        }
        return current;
    }
}
