package dataStructures.linkedList.interIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIterApp {
    public static void main(String[] args) throws IOException {
        LinkList theList = new LinkList();
        ListIterator iter = theList.getIterator();
        long value;

        iter.insertAfter(20);
        iter.insertAfter(50);
        iter.insertAfter(80);
        iter.insertBefore(120);
        int choice;
        while (true) {
            System.out.print("Enter first letter of show, reset, next, get, before, after, delete: ");
            System.out.flush();
            choice = getChar();
            switch (choice) {
                case 's':
                    if(!theList.isEmpty())
                        theList.displayList();
                    else
                        System.out.println("List is empty");
                    break;
                case 'r':
                    iter.reset();
                    break;
                case 'n':
                    if (!theList.isEmpty() && !iter.atEnd())
                        iter.nextLink();
                    else
                        System.out.println("Can't go to next link");
                    break;
                case 'g':
                    if (!theList.isEmpty()) {
                        System.out.println("Returned " + iter.getCurrent().dData);
                    }
                    else
                        System.out.println("List is empty");
                    break;
                case 'b':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    iter.insertBefore(value);
                    break;
                case 'a':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    iter.insertAfter(value);
                    break;
                case 'd':
                    if (!theList.isEmpty()) {
                        value = iter.deleteCurrent();
                        System.out.println("Deleted: " + value);
                    }
                    else {
                        System.out.println("Can't delete");
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}