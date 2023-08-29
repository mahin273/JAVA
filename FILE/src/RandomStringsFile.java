import java.io.*;
import java.io.IOException;
import java.util.Random;

public class RandomStringsFile {
    public static void main(String[] args) {
        // Generate a file with 100 random strings
        createRandomStringsFile("randomStrings.txt", 100, 5);

        // Create a file with strings that have at least one digit
        filterStringsByDigit("randomStrings.txt", "filteredStrings.txt");
    }

    public static void createRandomStringsFile(String fileName, int count, int length) {
        try {
            FileWriter writer = new FileWriter(fileName);

            Random random = new Random();
            for (int i = 0; i < count; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < length; j++) {
                    char c;
                    if (random.nextBoolean()) {
                        c = (char) (random.nextInt(10) + '0'); // Digit
                    } else {
                        c = (char) (random.nextInt(26) + 'A'); // Uppercase letter
                    }
                    sb.append(c);
                }
                writer.write(sb.toString() + "\n");
            }

            writer.close();
            System.out.println("Random strings file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void filterStringsByDigit(String sourceFileName, String targetFileName) {
        try {
            FileWriter writer = new FileWriter(targetFileName);
            FileReader reader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (containsDigit(line)) {
                    writer.write(line + "\n");
                }
            }

            reader.close();
            bufferedReader.close();
            writer.close();
            System.out.println("Filtered strings file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}