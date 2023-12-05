package dataStructures.stackAndQueues.infixAndPostfix;

import dataStructures.stackAndQueues.stack.StackX;

public class InToPost {
    private StackX theStack;
    private String input;
    private String output = "";
    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }
    public String doTrans() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.displayStack("For " + ch + " ");
            switch(ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            theStack.displayStack("While ");
            output = output + theStack.pop();
        }
        theStack.displayStack("End  ");
        return output;
    }
    public void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char onTop = theStack.pop();
            if (onTop == '(') {
                theStack.push(onTop);
                break;
            }
            else {
                int prec2;
                if (onTop == '+' || onTop == '-') {
                    prec2 = 1;
                }
                else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    theStack.push(onTop);
                    break;
                }
                else {
                    output = output + onTop;
                }
            }
            theStack.push(opThis);
        }
    }
    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if(chx == '(') {
                break;
            }
            else {
                output = output + chx;
            }
        }
    }
}
