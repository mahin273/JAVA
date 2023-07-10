import java.util.*;

public class L3P1 {
    public static void main(String[] args) {
        int Positive = 0;
        int neg = 0;
        int count = 0;
        int total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 10 integer: ");
        while (count < 10) {
            int num = s.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) {
                Positive++;
            } else if (num < 0) {
                neg++;
            }
            total += count;
            count++;
        }
        if (count > 0) {
            double avg = total / count;
            System.out.println("Pos = " + Positive + " Negative = " + neg + " avg = " + avg);
        }

    }
}
