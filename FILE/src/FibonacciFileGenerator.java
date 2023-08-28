import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FibonacciFileGenerator {
    public static void main(String[] args) {
        generateFibonacciFile("fibonacci_numbers.txt", 100);
    }

    public static void generateFibonacciFile(String fileName, int count) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);

            int[] fibonacciNumbers = new int[count];
            fibonacciNumbers[0] = 0;
            fibonacciNumbers[1] = 1;

            for (int i = 2; i < count; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }

            for (int number : fibonacciNumbers) {
                writer.write(number + "\n");
            }

            writer.close();
            System.out.println("Fibonacci file generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the Fibonacci file.");
            e.printStackTrace();
        }
    }
}