import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1:v");
        double a = sc.nextDouble();
        System.out.println("Enter Num2: ");
        double b = sc.nextDouble();
        System.out.println("Enter Operator: ");
        char operator = sc.next().charAt(0);

        System.out.println("Final Result: ");

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
    
}
