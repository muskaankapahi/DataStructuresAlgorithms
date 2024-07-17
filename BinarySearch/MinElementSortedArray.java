package BinarySearch;/*A sorted array of unique integers was rotated at an unknown pivot.
For example, [10, 20, 30, 40, 50] becomes [30, 40, 50, 10, 20].
Find the index of the minimum element in this array.
Input: [30, 40, 50, 10, 20]
Output: 3
Explanation: The smallest element is 10, and its index is 3.
Input: [3, 5, 7, 11, 13, 17, 19, 2]
Output: 7
* */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class MinElementSortedArray {
    public static int findMinRotated(List<Integer> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int left = 0 , right = arr.size() - 1;
        int index = -1;
        while(left <= right)
        {
            int mid = left + (right-left) / 2;
            if(arr.get(mid) <= arr.get(arr.size() - 1))
            {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int res = findMinRotated(arr);
        System.out.println(res);
    }
}


