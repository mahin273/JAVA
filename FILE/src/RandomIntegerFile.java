import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RandomIntegerFile {
    public static void main(String[] args) {
        generateRandomIntegerFile("random_integers.txt", 100);
        findMinMax("random_integers.txt", "min_max.txt");
    }

    public static void generateRandomIntegerFile(String fileName, int count) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);

            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt();
                writer.write(randomNumber + "\n");
            }

            writer.close();
            System.out.println("File generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the file.");
            e.printStackTrace();
        }
    }

    public static void findMinMax(String inputFile, String outputFile) {
        try {
            File inputFileObj = new File(inputFile);
            File outputFileObj = new File(outputFile);
            FileWriter writer = new FileWriter(outputFileObj);

            Scanner scanner = new Scanner(inputFileObj);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minIndex = 0;
            int maxIndex = 0;
            int currentIndex = 0;

            while (scanner.hasNextInt()) {
                int currentNumber = scanner.nextInt();
                if (currentNumber < min) {
                    min = currentNumber;
                    minIndex = currentIndex;
                }
                if (currentNumber > max) {
                    max = currentNumber;
                    maxIndex = currentIndex;
                }
                currentIndex++;
            }

            writer.write("Minimum: " + min + ", Index: " + minIndex + "\n");
            writer.write("Maximum: " + max + ", Index: " + maxIndex + "\n");

            writer.close();
            scanner.close();
            System.out.println("Min-Max file generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while finding the min-max values.");
            e.printStackTrace();
        }
    }
}