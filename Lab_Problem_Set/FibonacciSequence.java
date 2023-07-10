import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        ArrayList<Integer> fibonacciSequence = generateFibonacciSequence(n);
        System.out.println("Output: " + fibonacciSequence);
        scanner.close();
    }

    public static ArrayList<Integer> generateFibonacciSequence(int n) {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>();
        if (n >= 1) {
            fibonacciSequence.add(0);
        }
        if (n >= 2) {
            fibonacciSequence.add(1);
        }
        for (int i = 2; i < n; i++) {
            int sum = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
            fibonacciSequence.add(sum);
        }
        return fibonacciSequence;
    }
}