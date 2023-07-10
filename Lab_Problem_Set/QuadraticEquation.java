import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;
        // Display the result based on the discriminant
        if (discriminant > 0) {
            double root1 = (-b + squareRoot(discriminant)) / (2 * a);
            double root2 = (-b - squareRoot(discriminant)) / (2 * a);
            System.out.println("The equation has two real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root: " + root);
        } else {
            System.out.println("The equation has no real roots");
        }
        scanner.close();
    }

    public static double squareRoot(double num) {
        double precision = 0.00001;
        double x = num;
        while (Math.abs(x * x - num) > precision) {
            x = (x + num / x) / 2;
        }
        return x;
    }
}