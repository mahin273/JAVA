import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee>employees = new ArrayList<>();

        //Create FulltimeEmployee object
        for (int i = 1;i<=3;i++){
            FulltimeEmployee ftEmployee = createFulltimeEmployee(i);
            employees.add(ftEmployee);
        }

        //Create ParttimeEmployee Object
        for (int i = 4;i<=6;i++){
            ParttimeEmployee ptEmployee = createParttimeEmployee(i);
            employees.add(ptEmployee);
        }

        //print Details of all employees
        for(Employee employee : employees)
        {
if(employee instanceof  ParttimeEmployee){
    System.out.println("Part Time");
}
System.out.println("Employee Name: "+employee.getName());
System.out.println("Employee ID "+ employee.getID());
System.out.println("Date of Birth: "+employee.getDateOfBirth().getTime());
System.out.println("Salary: "+employee.getSalary());
System.out.println();
        }

        //Print information for a specifiq birth year
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter BirthYear: ");
        int birthYear = scan.nextInt();
    System.out.println("Employee born in "+ birthYear+ ": ");
for(Employee employee : employees){
    if(employee.getDateOfBirth().get(Calendar.YEAR) == birthYear){
        System.out.println("Employee Name: "+employee.getName());
        System.out.println("Employee ID: "+employee.getID());
        System.out.println("Date of Birth: "+employee.getDateOfBirth().getTime());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println();
    }
}

        // Sort employees based on salary (using Comparable interface)
employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

// Print details of all employees after sorting
System.out.println("Employees sorted by salary: ");
for(Employee employee : employees){
    if(employee instanceof ParttimeEmployee){
        System.out.println("Parttime");
    }
    System.out.println("Employee Name: "+employee.getName());
    System.out.println("Employee ID: " + employee.getID());
    System.out.println("Date of Birth: " + employee.getDateOfBirth().getTime());
    System.out.println("Salary: " + employee.getSalary());
    System.out.println();
}
    }



    private static FulltimeEmployee createFulltimeEmployee(int id) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fulltime Employee "+id+" details");
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Day of Birth: ");
        int day = scan.nextInt();
        scan.nextLine();
        System.out.println("Month of Birth:");
        int month= scan.nextInt();
        scan.nextLine();
        System.out.println("Year of Birth:");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Monthly Salary: ");
        double monthlySalary = scan.nextDouble();
        scan.nextLine();
        return new FulltimeEmployee(name,id,day,month,year,monthlySalary);
    }
    private static ParttimeEmployee createParttimeEmployee(int id) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Parttime Employee "+id+" details");
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Day of Birth: ");
        int day = scan.nextInt();
        scan.nextLine();
        System.out.println("Month of Birth:");
        int month= scan.nextInt();
        scan.nextLine();
        System.out.println("Year of Birth:");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Hours worked: ");
        double hours = scan.nextDouble();
        scan.nextLine();
        System.out.println("Hourly Rate: ");
        double hourlyRate = scan.nextDouble();
        scan.nextLine();
        return new ParttimeEmployee(name,id,day,month,year,hours, hourlyRate);
    }
}