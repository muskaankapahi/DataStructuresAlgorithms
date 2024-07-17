package BinarySearch;/* Given a sorted array of integers and a target integer, find the first
occurrence of the target and return its index. Return -1 if the target is not in the array.

Input:
arr = [1, 3, 3, 3, 3, 6, 10, 10, 10, 100]
target = 3
Output: 1
* */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class FirstOccurenceWithDuplicates {
    public static int findFirstOccurrence(List<Integer> arr, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        int start = 0 , end = arr.size() - 1;
        int boundary = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
    
            if(arr.get(mid) == target)
            {
                boundary = mid;
                end = mid - 1;
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return boundary;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int target = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = findFirstOccurrence(arr, target);
        System.out.println(res);
    }
}

