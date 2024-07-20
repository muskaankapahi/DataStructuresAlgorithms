package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {
    static List<List<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {5, 4, 3};
        print(arr, new ArrayList<>(), 0);
        System.out.println(answer);
    }

    public static void print(int[] arr, ArrayList<Integer> current, int first) {
        answer.add(new ArrayList<>(current));
        for (int k = first; k < arr.length; k++) {
            current.add(arr[k]);
            print(arr, current, k + 1);
            current.remove(current.size() - 1);
        }
    }
}
