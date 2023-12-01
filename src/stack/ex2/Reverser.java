package stack.ex2;

public class Reverser {

    private String input;
    private String output;

    Reverser(String in) {
        input = in;
    }

    public String doReverse() {
        int stackSize = input.length();
        StackChar stackChar = new StackChar(stackSize);
        for (int i = 0; i < input.length(); i++) {
            stackChar.push(input.charAt(i));
        }
        output = "";
        while (!stackChar.isEmpty()) {
            output = output + stackChar.pop();
        }
        return output;
    }
}
