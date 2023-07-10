import java.util.*;

public class L3P3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of the student:");
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();

        int[] scores = new int[student];
        int best = 0;
        System.out.println("Enter" + student + " scores ");
        for (int i = 0; i < student; i++) {
            scores[i] = scan.nextInt();
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        for (int i = 0; i < student; i++) {
            String grade;
            if (scores[i] >= best - 10) {
                grade = "A";
            } else if (scores[i] >= best - 20) {
                grade = "B";
            } else if (scores[i] >= best - 30) {
                grade = "C";
            } else if (scores[i] >= best - 40) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Student" + i + " score is " + scores[i] + " and grade is " + grade);
        }

    }
}
