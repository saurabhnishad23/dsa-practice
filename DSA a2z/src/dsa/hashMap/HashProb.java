package dsa.hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashProb {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
                continue;
            output.add(arr[i]);
            map.put(arr[i], true);
        }
        return output;
    }

    static ArrayList<Integer> remoDup(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
                continue;
            ans.add(arr[i]);
            map.put(arr[i], true);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2, 3, 1, 6, 2, 5 };
        ArrayList<Integer> output = remoDup(arr);
        System.out.println(output);
    }
}
