import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }

}
