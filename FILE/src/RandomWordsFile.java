import java.io.*;
import java.util.*;

public class RandomWordsFile {
    public static void main(String[] args) {
        // Generate a file with 100 random words
        createRandomWordsFile("randomWords.txt", 100, 20);

        // Sort words in ascending order and store in another file
        sortWordsAscending("randomWords.txt", "sortedWordsAscending.txt");

        // Sort words in descending order and store in another file
        sortWordsDescending("randomWords.txt", "sortedWordsDescending.txt");
    }

    public static void createRandomWordsFile(String fileName, int count, int maxLength) {
        try {
            FileWriter writer = new FileWriter(fileName);
            Random random = new Random();

            for (int i = 0; i < count; i++) {
                int wordLength = random.nextInt(maxLength) + 1;
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < wordLength; j++) {
                    char ch = (char) (random.nextInt(26) + 'a');
                    sb.append(ch);
                }

                writer.write(sb.toString() + "\n");
            }

            writer.close();
            System.out.println("Random words file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortWordsAscending(String sourceFileName, String targetFileName) {
        try {
            FileReader reader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<String> words = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                words.add(line);
            }

            Collections.sort(words);

            FileWriter writer = new FileWriter(targetFileName);
            for (String word : words) {
                writer.write(word + "\n");
            }

            reader.close();
            bufferedReader.close();
            writer.close();
            System.out.println("Words sorted in ascending order and stored in a file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortWordsDescending(String sourceFileName, String targetFileName) {
        try {
            FileReader reader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<String> words = new ArrayList<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                words.add(line);
            }

            Collections.sort(words, Collections.reverseOrder());

            FileWriter writer = new FileWriter(targetFileName);
            for (String word : words) {
                writer.write(word + "\n");
            }

            reader.close();
            bufferedReader.close();
            writer.close();
            System.out.println("Words sorted in descending order and stored in a file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}