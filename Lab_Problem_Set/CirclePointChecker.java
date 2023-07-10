import java.util.Scanner;
 public class CirclePointChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // Prompt the user to enter the center and radius of the circle
        System.out.print("Enter the center of the circle (p q): ");
        double p = scanner.nextDouble();
        double q = scanner.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();
         // Prompt the user to enter the point
        System.out.print("Enter the point (x y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
         // Check if the point is within the circle
        double distance = Math.sqrt(Math.pow(x - p, 2) + Math.pow(y - q, 2));
        if (distance <= r) {
            System.out.println("The point is inside the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }
        scanner.close();
    }
}