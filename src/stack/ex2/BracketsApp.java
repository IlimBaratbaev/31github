package stack.ex2;

import java.io.IOException;

import static stack.ex2.ReverseApp.getString;

public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.println("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.isEmpty()) {
                break;
            }
            BracketChecker bracketChecker = new BracketChecker(input);
            bracketChecker.check();
        }
    }
}
