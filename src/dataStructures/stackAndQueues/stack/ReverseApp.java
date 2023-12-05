package dataStructures.stackAndQueues.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while(true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();
            if (input.isEmpty()){
                break;
            }
            Reverser reverser = new Reverser(input);
            output = reverser.doReverse();
            System.out.println("Reversed: " + output);
        }
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
