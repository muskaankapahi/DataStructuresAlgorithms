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


/*class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return x;
        }
        int start = 1;
        int end = x;
        int boundary = -1;
        long num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            num = (long) mid * mid;
            if (num == x) {
                return mid;
            } else if (num < x) {
                boundary = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return boundary;
    }
}

/*
If the square of mid is greater than x, we know the square root lies in the lower half of the search range. So, we move the end pointer to the left to narrow down the search range.
If the square of mid is equal to x, we have found the square root! So, we return mid as the answer.
If the square of mid is less than x, we know the square root lies in the upper half of the search range. So, we move the start pointer to the right to continue the search.

*/