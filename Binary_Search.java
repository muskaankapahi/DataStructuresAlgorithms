/*Vanilla Binary Search
The search range is represented by the left and right indices that start from both
ends of the array and move towards each other as we search. When moving the index,
we discard elements and shrink the search range.
Time Complexity: O(log(n))
 */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public static int binarySearch(List<Integer> arr, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        int median = 0 , start = 0 , end = (arr.size() - 1);
        
        while ( start <= end)
        {
            median = (start + end) / 2;
            if(arr.get(median) == target)
            {
                return median;
            }
             else if(arr.get(median) > target)
                {
                    end = median -1;
                } else {
                    start = median +1;
                }
        }
        return -1;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int target = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = binarySearch(arr, target);
        System.out.println(res);
    }
}

