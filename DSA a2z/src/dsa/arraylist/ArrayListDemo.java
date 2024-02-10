package dsa.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(8);
        arr.add(2, 6);
        arr.set(4, 9);
        // arr.remove(5);
        arr.size();
        arr.get(4);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + ",");
        }
        // enhanced for loop - for each loop
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

    }
}
