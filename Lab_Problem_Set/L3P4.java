import java.util.Scanner;

public class L3P4 {
    public static void main(String[] args) {
        int occu[] = new int[101];
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter Integers between 1 to 100:");
        
          while(( num = scan.nextInt())!= 0){
            if(num>= 1 && num<= 100){
                occu[num]++;
            }
          

        }
        for (int i = 1; i < occu.length; i++) {
            if (occu[i] > 0) {
                System.out.println(i+" : " +occu[i]);
            }
        }
    }
}