package dataStructures.linkedList.simpleLinkedList;

public class LinkWithId {
    public int iData;
    public double dData;
    public LinkWithId next;

    public LinkWithId(int id, double dd) {
        iData = id;
        dData = dd;
    }
    public void displayLinkWithId() {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
