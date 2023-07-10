package Lab_Problem_Set;

import java.util.*;

public class L2P11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter second:");
        long minuites = s.nextLong();
        long year = minuites / (24 * 60 * 365);
        long rmin = minuites % (24 * 60 * 365);
        long days = rmin / (24 * 60);
        System.out.println(minuites + " minutes is approximately " + year + " years and " + days + " days");
        s.close();
    }
}
