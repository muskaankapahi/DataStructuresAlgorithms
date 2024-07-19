import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        System.out.println(Arrays.toString(numbers));

        sortArray(numbers);

        System.out.println("\nAfter:");
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] sortArray(int[] nums) {
        quick_sort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quick_sort(int[] nums, int left, int right) {
        if (left >= right) return;

        int pivot = nums[right];
        int LP = left;
        int RP = right - 1;

        while (LP <= RP) {
            while (LP <= RP && nums[LP] <= pivot) {
                LP++;
            }
            while (LP <= RP && nums[RP] >= pivot) {
                RP--;
            }
            if (LP < RP) {
                swap(nums, LP, RP);
            }
        }
        swap(nums, LP, right);

        quick_sort(nums, left, LP - 1);
        quick_sort(nums, LP + 1, right);
    }

    private static void swap(int[] nums, int I1, int I2) {
        int temp = nums[I1];
        nums[I1] = nums[I2];
        nums[I2] = temp;
    }
}
