import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Asdes {
    public static void main(String[] args) {
        generateRandomIntegerFile("random_integers2.txt", 100);
        generateSortedFiles("random_integers2.txt");
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

    public static void generateSortedFiles(String inputFile) {
        try {
            File inputFileObj = new File(inputFile);
            int[] numbers = readNumbersFromFile(inputFileObj);

            Arrays.sort(numbers);
            writeNumbersToFile(numbers, "ascending_order.txt");

            // Reverse the sorted array for descending order
            for (int i = 0; i < numbers.length / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - 1 - i];
                numbers[numbers.length - 1 - i] = temp;
            }

            writeNumbersToFile(numbers, "descending_order.txt");

            System.out.println("Sorted files generated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the sorted files.");
            e.printStackTrace();
        }
    }

    public static int[] readNumbersFromFile(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        int[] numbers = new int[100];
        int index = 0;

        while (scanner.hasNextInt()) {
            numbers[index] = scanner.nextInt();
            index++;
        }

        scanner.close();
        return numbers;
    }

    public static void writeNumbersToFile(int[] numbers, String fileName) throws IOException {
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file);

        for (int number : numbers) {
            writer.write(number + "\n");
        }

        writer.close();
    }
}