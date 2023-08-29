import java.io.*;
import java.util.*;

public class RandomIntegersFileC {
    public static void main(String[] args) {
        // Create a file with 100 random integers
        createRandomIntegersFile("randomIntegersC.txt", 100, 50, 500);

        // Create a file with composite numbers from the previous file
        createCompositeNumbersFile("randomIntegersC.txt", "compositeNumbers.txt");
    }

    public static void createRandomIntegersFile(String fileName, int count, int min, int max) {
        try {
            FileWriter writer = new FileWriter(fileName);
            Set<Integer> numbers = new HashSet<>();

            Random random = new Random();
            while (numbers.size() < count) {
                int num = random.nextInt(max - min + 1) + min;
                numbers.add(num);
            }

            for (int num : numbers) {
                writer.write(num + "\n");
            }

            writer.close();
            System.out.println("Random integers file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createCompositeNumbersFile(String sourceFileName, String targetFileName) {
        try {
            FileReader reader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            FileWriter writer = new FileWriter(targetFileName);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                int num = Integer.parseInt(line);
                if (isComposite(num)) {
                    writer.write(num + "\n");
                }
            }

            reader.close();
            bufferedReader.close();
            writer.close();
            System.out.println("Composite numbers file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isComposite(int num) {
        if (num < 4) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }

        return false;
    }
}