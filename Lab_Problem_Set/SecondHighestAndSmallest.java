import java.util.ArrayList;
import java.util.Random;

public class SecondHighestAndSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomArray(100);
        int secondHighestValue = findSecondHighest(numbers);
        int secondSmallestValue = findSecondSmallest(numbers);
        int secondHighestIndex = findIndex(numbers, secondHighestValue);
        int secondSmallestIndex = findIndex(numbers, secondSmallestValue);
        System.out.println("Second highest value: " + secondHighestValue);
        System.out.println("Second highest index: " + secondHighestIndex);
        System.out.println("Second smallest value: " + secondSmallestValue);
        System.out.println("Second smallest index: " + secondSmallestIndex);
    }

    public static ArrayList<Integer> generateRandomArray(int size) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1000)); // Generating random integers between 0 and 999
        }
        return numbers;
    }

    public static int findSecondHighest(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static int findSecondSmallest(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;
            }
        }
        return secondMin;
    }

    public static int findIndex(ArrayList<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                return i;
            }
        }
        return -1; // If target is not found in the array
    }
}