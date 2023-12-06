package dataStructures.stackAndQueues.infixAndPostfix;


import dataStructures.stackAndQueues.stack.StackInt;

public class ParsePost {
    private StackInt theStack;
    private String input;
    public ParsePost(String s) {
        input = s;
    }
    public int doParse() {
        theStack = new StackInt(20);
        char ch;
        int j;
        int num1, num2, interAns;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            theStack.displayStack(ch + " ");
            if(ch >= '0' && ch <= '9') {
                theStack.push((int) (ch - '0'));
            }
            else {
                num2 = theStack.pop();
                num1 = theStack.pop();
                switch (ch) {
                    case '+':
                        interAns = num2 + num1;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStack.push(interAns);
            }

        }
        interAns = theStack.pop();
        return interAns;
    }
}
