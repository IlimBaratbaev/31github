package dataStructures.queue;

public class QueueApp {
    public static void main(String[] args) {
        QueueLong2 queue = new QueueLong2(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}