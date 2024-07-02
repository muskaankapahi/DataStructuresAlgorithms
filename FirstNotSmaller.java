/* Given an array of integers sorted in increasing order and a target,
find the index of the first element in the array that is larger than
or equal to the target. Assume that it is guaranteed to find a satisfying number.

 */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public static int firstNotSmaller(List<Integer> arr, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        int start = 0 , end  = arr.size() - 1;
        int boundaryIndex = -1;
            
            while(start<=end)
            {
                int mid = start + (end - start)/2;
                if(arr.get(mid) >= target)
                {
                    boundaryIndex = mid;
                    end = mid - 1;
                }
                else
                    start = mid + 1;
            }
        
        return boundaryIndex;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int target = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = firstNotSmaller(arr, target);
        System.out.println(res);
    }
}

