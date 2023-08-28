import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        // Creating three IndoorPatient objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for IndoorPatient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Systolic: ");
            int systolic = scanner.nextInt();
            System.out.print("Diastolic: ");
            int diastolic = scanner.nextInt();
            System.out.print("Diabetes Point: ");
            double diabetesPoint = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Admission Date (day): ");
            int day = scanner.nextInt();
            System.out.print("Admission Date (month): ");
            int month = scanner.nextInt();
            System.out.print("Admission Date (year): ");
            int year = scanner.nextInt();
            Calendar admissionDate = Calendar.getInstance();
            admissionDate.set(year, month - 1, day);
            System.out.print("Bed No: ");
            int bedNo = scanner.nextInt();
            System.out.print("Daily Fee: ");
            double dailyFee = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            IndoorPatient indoorPatient = new IndoorPatient(name, age, systolic, diastolic, diabetesPoint, admissionDate, bedNo, dailyFee);
            patients.add(indoorPatient);
        }

        // Creating three OutdoorPatient objects
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for OutdoorPatient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Systolic: ");
            int systolic = scanner.nextInt();
            System.out.print("Diastolic: ");
            int diastolic = scanner.nextInt();
            System.out.print("Diabetes Point: ");
            double diabetesPoint = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Speciality: ");
            String speciality = scanner.nextLine();
            System.out.print("Consultation Fee: ");
            double consultationFee = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            OutdoorPatient outdoorPatient = new OutdoorPatient(name, age, systolic, diastolic, diabetesPoint, speciality, consultationFee);
            patients.add(outdoorPatient);
        }

        // Sort patients based on age in descending order
        Collections.sort(patients);

        // Print patients with high or low blood pressure
        System.out.println("Patients with high or low blood pressure:");
        for (Patient patient : patients) {
            if (patient.getSystolic() > 120 || patient.getDiastolic() < 80) {
                System.out.println(patient);
            }
        }

        // Print patient details including bills
        System.out.println("Patient details including bills:");
        for (Patient patient : patients) {
            System.out.println("------------------------------");
            if (patient instanceof IndoorPatient) {
                System.out.println("Indoor");
            } else if (patient instanceof OutdoorPatient) {
                System.out.println("Outdoor");
            }
            System.out.println(patient);
            System.out.println("Invoice: $" + patient.getInvoice());
        }
    }
}
