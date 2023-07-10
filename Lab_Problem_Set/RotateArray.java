import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of steps to rotate: ");
        int k = scanner.nextInt();
        System.out.println("Input: " + Arrays.toString(nums) + ", k = " + k);
        rotate(nums, k);
        System.out.println("Output: " + Arrays.toString(nums));
        scanner.close();
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k to be within the range of array size
        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}