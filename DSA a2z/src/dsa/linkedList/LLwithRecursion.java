package dsa.linkedList;

public class LLwithRecursion extends LinkedListUse {

    // print ll with recursion
    static void printR(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printR(head.next);
    }

    // insert node in LL recursively
    static Node<Integer> insertR(Node<Integer> head, int elem, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            Node<Integer> newNode = new Node<Integer>(elem);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insertR(head.next, elem, pos - 1);
            return head;
        }

    }

    static Node<Integer> insertR1(Node<Integer> head, int elem, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            Node<Integer> newNode = new Node<Integer>(elem);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insert(head.next, elem, pos - 1);
            return head;
        }
    }

    // Delete Node recursively
    static Node<Integer> deleteR(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }

        head.next = deleteR(head.next, pos - 1);
        return head;

    }

    static Node<Integer> delNode(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        head.next = delNode(head.next, pos - 1);
        return head;
    }

    // reverse the linkedList recursively
    static Node<Integer> reverseR(Node<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> smallHead = reverseR(head.next);
        Node<Integer> tail = smallHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return smallHead;

    }

    static Node<Integer> revLL(Node<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> smallHead = revLL(head.next);
        Node<Integer> tail = head.next;
        tail.next = head;
        head.next = null;

        return smallHead;
    }

    static Node<Integer> revNode(Node<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> newHead = revLL(head.next);
        Node<Integer> tail = head.next;
        tail.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        // head = insertR1(head, 69, 2);
        // head = deleteR(head, 3);
        // head = reverseR(head);
        head = revNode(head);

        printR(head);
    }
}
