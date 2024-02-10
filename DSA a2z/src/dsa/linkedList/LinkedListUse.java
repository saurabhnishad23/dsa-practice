package dsa.linkedList;

import java.util.Scanner;

public class LinkedListUse {

    static Node<Integer> createLinkedList() {

        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    static void print(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
        // print(head);
    }

    static int length(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static int ithNode(Node<Integer> head, int pos) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null && count < pos) {
            temp = temp.next;
            count++;
        }
        return temp.data;
    }

    public static Node<Integer> takeInput() {

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;

        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    // static Node<Integer> takeInput1() {
    // Scanner s = new Scanner(System.in);
    // int data = s.nextInt();
    // Node<Integer> head = null;

    // while (data != -1) {
    // Node<Integer> currentNode = new Node<Integer>(data);
    // if (head == null) {
    // head = currentNode;
    // } else {
    // Node<Integer> tail = head;
    // while (tail.next != null) {
    // tail = tail.next;
    // }
    // tail.next = currentNode;
    // }
    // data = s.nextInt();
    // }
    // return head;
    // }

    static Node<Integer> takeInput1() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;

        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    // optimised take input method

    static Node<Integer> takeNodeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currNode = new Node<Integer>(data);
            if (head == null) {
                head = currNode;
                tail = currNode;
            } else {
                tail.next = currNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    static Node<Integer> takeNodeInput1() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail = null;

        while (data != -1) {
            Node<Integer> cuNode = new Node<Integer>(data);
            if (head == null) {
                head = cuNode;
                tail = cuNode;
            } else {
                tail.next = cuNode;
                tail = cuNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    // insert node at ith position
    static Node<Integer> insertNode(Node<Integer> head, int elem, int pos) {
        Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
        Node<Integer> prev = head;
        int count = 0;
        if (pos == 0) {
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        } else {

            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                nodeToBeInserted.next = prev.next;
                prev.next = nodeToBeInserted;
            }
            return head;
        }

    }

    static Node<Integer> insertNode1(Node<Integer> head, int elem, int pos) {
        Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
        Node<Integer> prev = head;
        int count = 0;
        if (pos == 0) {
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        } else {
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                nodeToBeInserted.next = prev.next;
                prev.next = nodeToBeInserted;
            }
            return head;
        }
    }

    static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
        Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
        Node<Integer> prev = head;
        int count = 0;

        if (pos == 0) {
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        } else {
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                nodeToBeInserted.next = prev.next;
                prev.next = nodeToBeInserted;
            }
            return head;
        }
    }

    static Node<Integer> insertNode2(Node<Integer> head, int elem, int pos) {
        Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
        int count = 0;
        Node<Integer> prev = head;

        if (pos == 0) {
            nodeToBeInserted.next = head;
            return nodeToBeInserted;
        }
        while (count < pos - 1 && prev != null) {
            count++;
            prev = prev.next;
        }
        if (prev != null) {
            nodeToBeInserted.next = prev.next;
            prev.next = nodeToBeInserted;
        }
        return head;
    }

    // delete a node

    static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        int count = 0;
        Node<Integer> currHead = head;
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }

        while (count < pos - 1 && currHead != null) {
            currHead = currHead.next;
            count++;
        }

        if (currHead == null || currHead.next == null) {
            return head;
        }
        currHead.next = currHead.next.next;
        return head;
    }

    static Node<Integer> delete(Node<Integer> head, int pos) {
        Node<Integer> cuNode = head;
        int count = 0;

        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }

        while (count < pos - 1 && cuNode != null) {
            count++;
            cuNode = cuNode.next;
        }

        if (cuNode == null || cuNode.next == null) {
            return head;
        }
        cuNode.next = cuNode.next.next;
        return head;
    }

    static Node<Integer> delNode(Node<Integer> head, int pos) {
        int count = 0;
        Node<Integer> currNode = head;
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        while (count < pos - 1 && currNode != null) {
            count++;
            currNode = currNode.next;
        }
        if (currNode == null || currNode.next == null) {
            return head;
        }
        currNode.next = currNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1);
        // System.out.println(n1.data);
        // System.out.println(n1.next);

        // Node<Integer> head = createLinkedList();
        // Node<Integer> head = takeInput1();
        // Node<Integer> head = takeInput();
        Node<Integer> head = takeNodeInput1();
        head = insertNode2(head, 69, 3);
        head = delNode(head, 4);
        System.out.println(head + "check");
        // increment(head);
        print(head);
        System.out.println();
        System.out.println("length of linkedlist is " + length(head));

        System.out.println(ithNode(head, 2));

    }

}
