package dataStructures.linkedList.stackAndQueue.queue;

public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.insert(20);
        linkQueue.insert(40);
        linkQueue.displayQueue();
        linkQueue.remove();
        linkQueue.insert(67);
        linkQueue.insert(45);
        linkQueue.displayQueue();
        linkQueue.insert(98);
        linkQueue.remove();
        linkQueue.displayQueue();
    }
}