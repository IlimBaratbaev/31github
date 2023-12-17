package dataStructures.linkedList.practice.pQueueOnSortedLList;

import java.util.Scanner;

public class PQueueApp {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        char choice = ' ';
        long data;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Use words for commands(1-push, 2-peek, 3 - pop, 4 show, e - exit)");
        while (true) {
            System.out.print("Choose command: ");
            choice = scan.next().charAt(0);
            if (choice == '1') {
                System.out.print("Input data for push: ");
                data = scan.nextLong();
                priorityQueue.push(data);
            } else if (choice == '2') {
                System.out.println(priorityQueue.peek());
            } else if (choice == '3') {
                System.out.println(priorityQueue.pop());
            } else if (choice == '4') {
                priorityQueue.showQueue();
            } else if (choice == 'e') {
                break;
            } else {
                System.out.println("Invalid command!");
            }

        }
    }
}
