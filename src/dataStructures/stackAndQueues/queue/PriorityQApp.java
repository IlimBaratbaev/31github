package dataStructures.stackAndQueues.queue;

public class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ priorityQ = new PriorityQ(5);
        priorityQ.insert(30);
        priorityQ.insert(60);
        priorityQ.insert(10);
        priorityQ.insert(40);
        priorityQ.insert(20);
        while (!priorityQ.isEmpty()) {
            System.out.print(priorityQ.remove() + " ");
        }
        System.out.println();
    }
}
