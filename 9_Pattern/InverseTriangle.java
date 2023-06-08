import java.util.*;

public class InverseTriangle {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i,j;
        for (i = 1; i <=n; i++) {
            
            for(j=1;j<=n-i+1 ;j++)
            {
                System.out.print("*");

            }
            System.out.println();
            
        }
    }
    
}

    

