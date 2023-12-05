package dataStructures.stackAndQueues.stack;

public class Reverser {

    private String input;
    private String output;

    Reverser(String in) {
        input = in;
    }

    public String doReverse() {
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);
        for (int i = 0; i < input.length(); i++) {
            stackX.push(input.charAt(i));
        }
        output = "";
        while (!stackX.isEmpty()) {
            output = output + stackX.pop();
        }
        return output;
    }
}
