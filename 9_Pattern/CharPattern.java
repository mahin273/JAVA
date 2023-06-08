import java.util.Scanner;

public class CharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        char ch = 'A';
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                ;
            {
                System.out.print(ch);
                ch++;

            }
            System.out.println();

        }
    }
}
