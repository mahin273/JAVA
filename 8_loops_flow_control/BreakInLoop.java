import java.util.*;

public class BreakInLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number  : ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);

        }
        System.out.println("I'm Out of Loop");
    }

}
