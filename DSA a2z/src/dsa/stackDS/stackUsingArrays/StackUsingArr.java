package dsa.stackDS.stackUsingArrays;

public class StackUsingArr {

    private int[] data;
    private int topIndex;

    public StackUsingArr() {
        data = new int[2];
        topIndex = -1;
    }

    public StackUsingArr(int size) {
        data = new int[size];
        topIndex = -1;
    }

    public void push(int elem) {
        if (topIndex == data.length - 1) {
            doubleCapacity();
        }
        topIndex++;
        data[topIndex] = elem;
    }

    private void doubleCapacity() {
        System.out.println("Capacity doubled");
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public int peek() {
        return data[topIndex];
    }

    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    int size() {
        return topIndex + 1;
    }

    int pop() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

    boolean isEmpty() {
        return topIndex == -1;
    }
}
