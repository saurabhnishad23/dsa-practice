package dsa.stackDS.stackUsingLL;

import dsa.linkedList.Node;
// import dsa.stackDS.stackUsingArrays.StackEmptyException;

public class StackUsingLL<T> {

    // public class Node<T> {
    // T data;
    // Node<T> next;

    // public Node(T data) {
    // this.data = data;
    // next = null;
    // }

    // }

    Node<T> head;
    int size;

    // public StackUsingLL() {
    // head = null;
    // size = 0;
    // }

    public void push(T elem) {
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T pop() throws StackEmpException {
        if (size == 0) {
            throw new StackEmpException();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;

    }

    public T top() throws StackEmpException {
        if (size == 0) {
            throw new StackEmpException();
        }
        return head.data;
    }

    public T peek() throws StackEmpException {
        if (size == 0) {
            throw new StackEmpException();
        }
        return head.data;
    }
}
