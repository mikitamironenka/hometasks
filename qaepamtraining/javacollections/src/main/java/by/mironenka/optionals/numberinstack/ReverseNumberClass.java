package by.mironenka.optionals.numberinstack;

import java.util.Stack;

public class ReverseNumberClass {

    private final int number;
    private final Stack stack;

    public ReverseNumberClass(int number) {
        this.number = number;
        this.stack = new Stack();
    }

    public void reverseNumber() {

        char [] numbers = String.valueOf(number).toCharArray();

        for(char num : numbers){
            stack.push(num);}

        while(!stack.empty())
        {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print(stackNum);
        }
    }

    public int getNumber() {
        return number;
    }

    public Stack getStack() {
        return stack;
    }
}
