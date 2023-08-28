import java.util.Calendar;
abstract class University implements Comparable<University> {
    private String name;
    private String address;
    private Calendar dateOfEstablished;
    private int numberOfDepartments;

    public University() {
    }

    public University(String name, String address, int day, int month, int year, int numberOfDepartments) {
        this.name = name;
        this.address = address;
        this.dateOfEstablished = Calendar.getInstance();
        try {
            this.dateOfEstablished.set(year, month - 1, day); // Corrected order of parameters
        } catch (Exception e) {
            System.out.println("Invalid date of establishment");
        }
        this.numberOfDepartments = numberOfDepartments;
    }

    // Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Calendar getDateOfEstablished() {
        return dateOfEstablished;
    }

    public void setDateOfEstablished(Calendar dateOfEstablished) {
        this.dateOfEstablished = dateOfEstablished;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    @Override
    public String toString() {
        return "University [name=" + name + ", address=" + address + ", dateOfEstablished="
                + dateOfEstablished.getTime() + ", numberOfDepartments=" + numberOfDepartments + "]";
    }

    @Override
    public int compareTo(University other) {
        return this.dateOfEstablished.compareTo(other.dateOfEstablished);
    }

    public abstract int calculateScholarshipAmount(int totalCost, double scholarshipPercentage);

    public abstract int calculateEarlyAdmissionCost(int baseCost);

    public abstract double calculateGPA();
}