// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;

// public class RemoveDuplicates {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int size = scanner.nextInt();
//         int[] nums = new int[size];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             nums[i] = scanner.nextInt();
//         }
//         int[] result = removeDuplicates(nums);
//         System.out.println("Output: " + Arrays.toString(result));
//         scanner.close();
//     }

//     public static int[] removeDuplicates(int[] nums) {
//         List<Integer> list = new ArrayList<>();
//         for (int num : nums) {
//             if (!list.contains(num)) {
//                 list.add(num);
//             }
//         }
//         int[] result = new int[list.size()];
//         for (int i = 0; i < list.size(); i++) {
//             result[i] = list.get(i);
//         }
//         return result;
//     }
// }
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.print("Enter the size of the ArrayList: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < size; i++) {
            nums.add(scanner.nextInt());
        }
        List<Integer> result = removeDuplicates(nums);
        System.out.println("Output: " + result);
        scanner.close();
    }

    public static List<Integer> removeDuplicates(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}