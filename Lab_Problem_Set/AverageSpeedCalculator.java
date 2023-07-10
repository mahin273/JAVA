import java.util.Scanner;

public class AverageSpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the distance, minutes, and seconds
        System.out.print("Enter the distance completed in kilometers: ");
        double distanceKm = scanner.nextDouble();
        System.out.print("Enter the minutes spent during the run: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter the seconds spent during the run: ");
        int seconds = scanner.nextInt();
        // Convert minutes and seconds to hours
        double timeHours = minutes / 60.0 + seconds / 3600.0;
        // Convert distance from kilometers to miles
        double distanceMiles = distanceKm / 1.6;
        // Calculate average speed in miles per hour
        double averageSpeedMph = distanceMiles / timeHours;
        // Display the average speed
        System.out.println("Average speed: " + averageSpeedMph + " miles per hour");
        scanner.close();
    }
}