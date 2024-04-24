package dsa.stackDS.stackUsingLL;

// import dsa.stackDS.stackUsingArrays.StackEmptyException;

public class StackUse1 {
    public static void main(String[] args) throws StackEmpException, Exception {
        StackUsingLL<Integer> stack = new StackUsingLL<>();

        stack.push(10);

        stack.push(20);
        stack.push(30);
        stack.push(40);
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }
        System.out.println(stack.isEmpty());

        int[] arr = { 5, 6, 7, 8, 12 };

        StackUsingLL<Integer> st = new StackUsingLL<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
