/*
* An array of boolean values is divided into two sections: The left section consists of all false, and the right section consists of all true. Find the First True in a Sorted Boolean Array of the right section, i.e., the index of the first true element. If there is no true element, return -1.

Input: arr = [false, false, true, true, true]

Output: 2

Explanation: The first true's index is 2.
*  */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public static int findBoundary(List<Boolean> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int start = 0 , end = arr.size() - 1;
        int limit = -1;
        while(start <= end)
        {
           int mid = start + (end - start) / 2;
            if(arr.get(mid))
            {
                limit = mid;
                end = mid-1;
            } 
            else
            {
               start = mid + 1;
               
            }
        }
        return limit;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Boolean> arr = splitWords(scanner.nextLine()).stream().map(v -> v.equals("true")).collect(Collectors.toList());
        scanner.close();
        int res = findBoundary(arr);
        System.out.println(res);
    }
}

