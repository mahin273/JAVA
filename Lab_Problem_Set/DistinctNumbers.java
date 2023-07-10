import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (!isDistinct(numbers, num)) {
                numbers.add(num);
            }
        }
        System.out.println("Number of distinct numbers: " + numbers.size());
        System.out.print("Distinct numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public static boolean isDistinct(ArrayList<Integer> numbers, int num) {
        for (int n : numbers) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
}