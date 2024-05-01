package dsa.stackDS;

import java.util.Stack;

public class StackCollections {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.size());
        System.out.println(s.peek());
        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }

    }
}