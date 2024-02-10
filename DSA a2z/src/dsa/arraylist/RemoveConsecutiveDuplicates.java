package dsa.arraylist;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {

    static ArrayList<Integer> remoConseDupli(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 20, 20, 20, 30, 10, 40, 40 };

        ArrayList<Integer> result = remoConseDupli(arr);
        for (int elem : result) {
            System.out.print(elem + " ");
        }
    }
}
