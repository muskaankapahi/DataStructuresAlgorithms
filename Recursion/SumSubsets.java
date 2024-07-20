package Recursion;

import java.util.Arrays;

public class SumSubsets {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3 };
        Arrays.sort(arr);
        subsetSums(arr, 0,  0);
    }

    public static void subsetSums(int[] arr, int start, int sum){
        if(start == arr.length) {
            System.out.println(sum);
            return;
        }
        subsetSums(arr, start+1, sum+arr[start]);
        subsetSums(arr, start+1, sum);
    }
}