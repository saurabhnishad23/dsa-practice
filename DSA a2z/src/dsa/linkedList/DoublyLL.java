package dsa.linkedList;

public class DoublyLL {

    /**
     * DoubleNode
     */

    public static class DoubleNode {

        int data;
        DoubleNode next;
        DoubleNode back;

        DoubleNode(int data, DoubleNode next, DoubleNode back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }

        DoubleNode(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }

    static DoubleNode convertArrToDLL(int[] arr) {

        DoubleNode head = new DoubleNode(arr[0]);

        DoubleNode prev = head;

        for (int i = 1; i < arr.length; i++) {
            DoubleNode temp = new DoubleNode(arr[i], null, prev);

            prev.next = temp;

            prev = temp;
        }

        return head;
    }

    static DoubleNode conArrToDLL(int[] arr){

        DoubleNode head = new DoubleNode(arr[0]);

        DoubleNode prev = head;

        for(int i = 1; i < arr.length; i++){

            DoubleNode temp = new DoubleNode(arr[i], null, prev);

            prev.next = temp;
            prev = temp;

        }
        return head;
    }

    static DoubleNode reverseDoublyLL(DoubleNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        DoubleNode current = head;
        DoubleNode prev = null;

        while (current != null) {
            prev = current.back; // store a ref to pre node
            current.back = current.next; // swap the previous and next ref
            current.next = prev; // reverses the links
            current = current.back; // movin' to the next node

        }
        return prev.back;
    }
}