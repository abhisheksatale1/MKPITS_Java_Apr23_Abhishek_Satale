package Stackexamples;

import java.util.Stack;

public class Stackclassuser {
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(520);
        stack.push(466);
        stack.push(8765);

        System.out.println(stack.search(466));

    }
}
