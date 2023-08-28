import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<University> universities = new ArrayList<>();

        // Creating PublicUniversity objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Public University " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Day of Established: ");
            int day = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Month of Established: ");
            int month = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Year of Established: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Number of Departments: ");
            int numberOfDepartments = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Number of Halls: ");
            int numberOfHalls = scanner.nextInt();
            System.out.print("Politics Allowed (true/false): ");
            boolean politicsAllowed = scanner.nextBoolean();
            scanner.nextLine(); // Consume the newline character

            Calendar dateOfEstablished = Calendar.getInstance();
            dateOfEstablished.set(day, month - 1, year); // month is 0-based in Calendar class

            universities.add(new PublicUniversity(name, address, day,month,year, numberOfDepartments, numberOfHalls,
                    politicsAllowed));
        }

        // Creating PrivateUniversity objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Private University " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Day of Established: ");
            int day = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Month of Established: ");
            int month = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Year of Established: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Number of Departments: ");
            int numberOfDepartments = scanner.nextInt();
            System.out.print("UGC Approved (true/false): ");
            boolean ugcApproved = scanner.nextBoolean();
            System.out.print("Number of Trustee Members: ");
            int numberOfTrusteeMember = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Calendar dateOfEstablished = Calendar.getInstance();
            dateOfEstablished.set(day, month - 1, year); // month is 0-based in Calendar class

            universities.add(new PrivateUniversity(name, address, day,month,year, numberOfDepartments, ugcApproved,
                    numberOfTrusteeMember));
        }

        // Sorting universities based on their established year in descending order
        Collections.sort(universities);

        // Sorting universities based on their established year in Ascending order
        Collections.sort(universities, new Comparator<University>() {
            
        @Override
        public int compare(University u1, University u2) {
            return u1.getDateOfEstablished().compareTo(u2.getDateOfEstablished());
        }
        });

        // Printing all universities approved by UGC
        System.out.println("\nUniversities approved by UGC:");
        for (University university : universities) {
            if (university instanceof PrivateUniversity) {
                PrivateUniversity privateUniversity = (PrivateUniversity) university;
                if (privateUniversity.isUgcApproved()) {
                    System.out.println(privateUniversity);
                }
            }
        }

        // Printing all universities where politics are not allowed
        System.out.println("\nUniversities where politics are not allowed:");
        for (University university : universities) {
            if (university instanceof PublicUniversity) {
                PublicUniversity publicUniversity = (PublicUniversity) university;
                if (!publicUniversity.isPoliticsAllowed()) {
                    System.out.println(publicUniversity);
                }
            }
        }

        // Taking an address as input and displaying all universities from that address
        System.out.print("\nEnter an address to search for universities: ");
        String searchAddress = scanner.nextLine();
        System.out.println("\nUniversities from address '" + searchAddress + "':");
        for (University university : universities) {
            if (university.getAddress().equalsIgnoreCase(searchAddress)) {
                System.out.println(university);
            }
        }

        // Printing details of every university
        System.out.println("\nDetails of every university:");
        for (University university : universities) {
            if (university instanceof PublicUniversity) {
                System.out.println("Public " + university);
            } else if (university instanceof PrivateUniversity) {
                System.out.println("Private " + university);
            }
        }

        scanner.close();
    }
}