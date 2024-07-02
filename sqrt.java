import java.util.*;

class Solution {
    public static int squareRoot(int n) {
        // WRITE YOUR BRILLIANT CODE HERE
        int start = 2;
        int end = n / 2;
        int boundary = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid > n) {
                end = mid - 1;
            } else {
                boundary = mid;

            }
        }

        return boundary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = squareRoot(n);
        System.out.println(res);
    }
}
