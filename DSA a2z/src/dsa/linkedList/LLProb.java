package dsa.linkedList;

import java.util.Stack;

public class LLProb extends LLwithRecursion {

    // Brute force sol to rev LL
    static Node<Integer> revBrute(Node<Integer> head) {

        Node<Integer> temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;

    }

    // Reverse LL with iterative method

    static Node<Integer> revNode(Node<Integer> head) {

        Node<Integer> temp = head;
        Node<Integer> prev = null;

        while (temp != null) {
            Node<Integer> front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    static Node<Integer> revRLL(Node<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> newHead = revRLL(head.next);
        Node<Integer> front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    // midpoint of LL

    static Node<Integer> midNode(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) { // (if we use || and if fast.next !=null then
                                                              // fast.next.next gives nullPointerException)
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node<Integer> midPoint(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2) {

        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node<Integer> temp1 = head1, temp2 = head2;
        Node<Integer> head = null, tail = null;

        if (temp1.data <= temp2.data) {
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        } else {
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            tail.next = temp1;

        } else {
            tail.next = temp2;

        }
        return head;
    }

    static Node<Integer> mergeSortedNode(Node<Integer> head1, Node<Integer> head2) {

        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node<Integer> temp1 = head1, temp2 = head2;
        Node<Integer> head = null, tail = null;

        if (temp1.data <= temp2.data) {
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        } else {
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            tail.next = temp1;
        } else {
            tail.next = temp2;
        }
        return head;

    }

    static Node<Integer> mergeSortedLLNode(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return (head1);
        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;
        Node<Integer> head = null, tail = null;

        if (temp1.data <= temp2.data) {
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        } else {
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }
        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }
        if (temp1 != null)
            tail.next = temp1;
        if (temp2 != null)
            tail.next = temp2;

        return head;

    }

    static Node<Integer> mergeSort(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> mid = midNode(head);
        Node<Integer> headP1 = head;
        Node<Integer> headP2 = mid.next;
        mid.next = null;

        headP1 = mergeSort(headP1);
        headP2 = mergeSort(headP1);

        Node<Integer> finalHead = mergeSortedLL(headP1, headP2);

        return finalHead;

    }

    static Node<Integer> sortLL(Node<Integer> head) {

        if (head == null || head.next == null)
            return head;
        Node<Integer> mid = midNode(head);
        Node<Integer> headP1 = head;
        Node<Integer> headP2 = mid.next;
        mid.next = null;

        headP1 = sortLL(headP1);
        headP2 = sortLL(headP2);

        Node<Integer> finalNode = mergeSortedLLNode(headP1, headP2);

        return finalNode;

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput1();
        // // head = revBrute(head);
        // // head = revNode(head);
        // // head = revRLL(head);
        // Node<Integer> mid = midPoint(head);
        // printR(head);
        // System.out.println();
        // System.out.println(mid.data);
        // Node<Integer> head1 = takeInput();
        // Node<Integer> head2 = takeInput();
        // Node<Integer> head = mergeSortedNode(head1, head2);
        head = sortLL(head);
        printR(head);

    }
}
