import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean isPrimne = true;
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrimne = false;
            }
        }
        if (isPrimne == true) {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }

    }
    
}
