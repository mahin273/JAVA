import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<University> universities = new ArrayList<>();

        // Create three PublicUniversity objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Public University " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Day of Established: ");
            int day = scanner.nextInt();
            System.out.print("Month of Established: ");
            int month = scanner.nextInt();
            System.out.print("Year of Established: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Number of Departments: ");
            int numberOfDepartments = scanner.nextInt();
            System.out.print("Number of Halls: ");
            int numberOfHalls = scanner.nextInt();
            System.out.print("Politics Allowed (true/false): ");
            boolean politicsAllowed = scanner.nextBoolean();
            scanner.nextLine(); // Consume the newline character

            try {
                PublicUniversity publicUniversity = new PublicUniversity(name, address, day, month, year,
                        numberOfDepartments, numberOfHalls, politicsAllowed);
                universities.add(publicUniversity);
            } catch (Exception e) {
                System.out.println("Error creating Public University: " + e.getMessage());
            }
        }

        // Create three PrivateUniversity objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Private University " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Day of Established: ");
            int day = scanner.nextInt();
            System.out.print("Month of Established: ");
            int month = scanner.nextInt();
            System.out.print("Year of Established: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Number of Departments: ");
            int numberOfDepartments = scanner.nextInt();
            System.out.print("UGC Approved (true/false): ");
            boolean ugcApproved = scanner.nextBoolean();
            System.out.print("Number of Trustee Members: ");
            int numberOfTrusteeMember = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            try {
                PrivateUniversity privateUniversity = new PrivateUniversity(name, address, day, month, year,
                        numberOfDepartments, ugcApproved, numberOfTrusteeMember);
                universities.add(privateUniversity);
            } catch (Exception e) {
                System.out.println("Error creating Private University: " + e.getMessage());
            }
        }

        // Sort the universities based on the date of establishment
        Collections.sort(universities);

        // Print the list of universities
        System.out.println("\nList of Universities:");
        for (University university : universities) {
            System.out.println(university);
        }

        scanner.close();
    }
}