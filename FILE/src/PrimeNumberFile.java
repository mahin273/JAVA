import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class PrimeNumberFile {
    public static void main(String[] args) {
        generateRandomIntegerFile("random_integersp.txt", 100);
        findAndStorePrimeNumbers("random_integersp.txt", "prime_numbers.txt");
    }

    public static void generateRandomIntegerFile(String fileName, int count) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);

            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt(1000); // Generate random integers between 0 and 999
                writer.write(randomNumber + "\n");
            }

            writer.close();
            System.out.println("Random integer file generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the random integer file.");
            e.printStackTrace();
        }
    }

    public static void findAndStorePrimeNumbers(String inputFile, String outputFile) {
        try {
            File inputFileObj = new File(inputFile);
            File outputFileObj = new File(outputFile);
            FileWriter writer = new FileWriter(outputFileObj);

            Scanner scanner = new Scanner(inputFileObj);
            int index = 0;

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (isPrime(number)) {
                    writer.write("Prime Number: " + number + ", Index: " + index + "\n");
                }
                index++;
            }

            writer.close();
            scanner.close();
            System.out.println("Prime numbers file generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while finding and storing prime numbers.");
            e.printStackTrace();
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}