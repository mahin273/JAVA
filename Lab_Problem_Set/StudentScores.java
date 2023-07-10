import java.util.*;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        // Create a TreeMap to store the scores and names
        TreeMap<Integer, String> studentScores = new TreeMap<>(Collections.reverseOrder());
        // Prompt the user to enter the names and scores of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Enter the score of student " + (i + 1) + ": ");
            int score = scanner.nextInt();
            studentScores.put(score, name);
        }
        // Print the student names in decreasing order of their scores
        System.out.println("Student names in decreasing order of scores:");
        for (Map.Entry<Integer, String> entry : studentScores.entrySet()) {
            System.out.println(entry.getValue());
        }
        scanner.close();
    }
}