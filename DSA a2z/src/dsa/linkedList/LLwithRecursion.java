package dsa.linkedList;

public class LLwithRecursion extends LinkedListUse {

    static void printR(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printR(head.next);
    }

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
        if (head == null) {
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

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insertR1(head, 69, 2);
        head = deleteR(head, 0);
        printR(head);
    }
}
