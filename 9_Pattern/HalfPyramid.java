import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        scan.close();
        for (i = 1; i <= n; i++) {
            for (int j = 1; j<=i;j++)
            {
                System.out.print(j);
                
            }
        System.out.println();
    }


    }
}
