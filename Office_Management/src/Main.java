import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Create FulltimeEmployee objects
        for (int i = 1; i <= 3; i++) {
            FulltimeEmployee ftEmployee = createFulltimeEmployee(i);
            employees.add(ftEmployee);
        }

        // Create ParttimeEmployee objects
        for (int i = 4; i <= 6; i++) {
            ParttimeEmployee ptEmployee = createParttimeEmployee(i);
            employees.add(ptEmployee);
        }

        // Print details of all employees
        for (Employee employee : employees) {
            if (employee instanceof ParttimeEmployee) {
                System.out.print("Parttime ");
            }
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Date of Birth: " + employee.getDateOfBirth().getTime());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }

        // Print employee information for a specific birth year
        int birthYear = 1995;
        System.out.println("Employees born in " + birthYear + ":");
        for (Employee employee : employees) {
            if (employee.getDateOfBirth().get(Calendar.YEAR) == birthYear) {
                System.out.println("Employee Name: " + employee.getName());
                System.out.println("Employee ID: " + employee.getId());
                System.out.println("Date of Birth: " + employee.getDateOfBirth().getTime());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println();
            }
        }

        // Sort employees based on salary (using Comparable interface)
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        // Print details of all employees after sorting
        System.out.println("Employees sorted by salary:");
        for (Employee employee : employees) {
            if (employee instanceof ParttimeEmployee) {
                System.out.print("Parttime ");
            }
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Date of Birth: " + employee.getDateOfBirth().getTime());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }

    private static FulltimeEmployee createFulltimeEmployee(int id) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Fulltime Employee " + id + " details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Day of Birth: ");
        int day = scanner.nextInt();
        System.out.print("Month of Birth: ");
        int month = scanner.nextInt();
        System.out.print("Year of Birth: ");
        int year = scanner.nextInt();
        System.out.print("Monthly Salary: ");
        double monthlySalary = scanner.nextDouble();

        
         
        return new FulltimeEmployee(name, id, day, month, year, monthlySalary);
    }

    private static ParttimeEmployee createParttimeEmployee(int id) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Parttime Employee " + id + " details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Day of Birth: ");
        int day = scanner.nextInt();
        System.out.print("Month of Birth: ");
        int month = scanner.nextInt();
        System.out.print("Year of Birth: ");
        int year = scanner.nextInt();
        System.out.print("Hours worked: ");
        int hours = scanner.nextInt();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();

        

        return new ParttimeEmployee(name, id, day, month, year, hours, hourlyRate);
        
    }
}