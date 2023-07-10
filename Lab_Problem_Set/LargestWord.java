import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String largestWord = findLargestWord(sentence);
        System.out.println("Largest word: " + largestWord);
        scanner.close();
    }

    public static String findLargestWord(String sentence) {
        String[] words = sentence.split(" ");
        String largestWord = "";
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        return largestWord;
    }
}