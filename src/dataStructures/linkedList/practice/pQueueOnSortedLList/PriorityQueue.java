package dataStructures.linkedList.practice.pQueueOnSortedLList;

public class PriorityQueue {
    private  SortedLinkList  queue;
    public PriorityQueue() {
        queue = new SortedLinkList();
    }
    public void push(long data) {
        queue.insert(data);
    }
    public long peek() {
        return queue.getFirst().getData();
    }
    public long pop(){
        return queue.remove();
    }

    public void showQueue() {
        System.out.print("Queue (min --> max): ");
        queue.displayList();
    }
}
