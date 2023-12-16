package dataStructures.linkedList.practice.pQueueOnSortedLList;


public class SortedLinkList {
    private Link first;
    public SortedLinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(long key) {
        Link newLink = new Link(key);
        Link current = first;
        Link previous = null;
        while (current != null && key > current.getData()) {
            previous = current;
            current = current.getNext();
        }
        if (previous == null) {
            first = newLink;
        }
        else {
            previous.setNext(newLink);
        }
        newLink.setNext(current);
    }
    public long remove() {
        Link temp = first;
        first = first.getNext();
        return temp.getData();
    }
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayData();
            current = current.getNext();
        }
    }
}
