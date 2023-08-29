import java.io.*;
import java.util.Random;


public class RandomNumbersFile {
    public static void main(String[] args) {
        // Generate a file with 200 random floating-point numbers
        createRandomNumbersFile("randomNumbers.txt", 200, 0.0, 1.0);

        // Create a file with numbers greater than 0.5
        filterNumbersGreaterThan("randomNumbers.txt", "filteredNumbers.txt", 0.5);
    }

    public static void createRandomNumbersFile(String fileName, int count, double min, double max) {
        try {
            FileWriter writer = new FileWriter(fileName);

            Random random = new Random();
            for (int i = 0; i < count; i++) {
                double num = random.nextDouble() * (max - min) + min;
                writer.write(num + "\n");
            }

            writer.close();
            System.out.println("Random numbers file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void filterNumbersGreaterThan(String sourceFileName, String targetFileName, double threshold) {
        try {
            FileWriter writer = new FileWriter(targetFileName);
            FileReader reader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                double num = Double.parseDouble(line);
                if (num > threshold) {
                    writer.write(num + "\n");
                }
            }

            reader.close();
            bufferedReader.close();
            writer.close();
            System.out.println("Filtered numbers file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}