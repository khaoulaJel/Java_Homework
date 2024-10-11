package PracticeCollections;

import java.util.Stack;

public class Question8 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped item: " + stack.pop());
        System.out.println("Top item: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    }
}
