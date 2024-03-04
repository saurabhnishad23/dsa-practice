package dsa.stackDS.stackUsingArrays;

public class StackUse {

    public static void main(String[] args) throws StackEmptyException {

        StackUsingArr stack = new StackUsingArr();
        int[] arr = { 5, 6, 7, 8, 12 };
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());

        StackUsingArr stack1 = new StackUsingArr();
        for (int i = 0; i < arr.length; i++) {
            stack1.push(arr[i]);
        }

        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }

    }
}
