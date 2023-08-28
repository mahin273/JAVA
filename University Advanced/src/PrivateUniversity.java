import java.util.Scanner;
class PrivateUniversity extends University {
    private boolean ugcApproved;
    private int numberOfTrusteeMember;

    public PrivateUniversity() {
    }

    public PrivateUniversity(String name, String address, int day, int month, int year, int numberOfDepartments,
            boolean ugcApproved, int numberOfTrusteeMember) {
        super(name, address, day, month, year, numberOfDepartments);
        this.ugcApproved = ugcApproved;
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }

    // Setters and Getters
    public boolean isUgcApproved() {
        return ugcApproved;
    }

    public void setUgcApproved(boolean ugcApproved) {
        this.ugcApproved = ugcApproved;
    }

    public int getNumberOfTrusteeMember() {
        return numberOfTrusteeMember;
    }

    public void setNumberOfTrusteeMember(int numberOfTrusteeMember) {
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }

    @Override
    public String toString() {
        return "Private " + super.toString() + " [ugcApproved=" + ugcApproved + ", numberOfTrusteeMember="
                + numberOfTrusteeMember + "]";
    }

    @Override
    public int calculateScholarshipAmount(int totalCost, double scholarshipPercentage) {
        try {
            double gpa = calculateGPA();
            if (gpa == 5.00) {
                return (int) (totalCost * (scholarshipPercentage / 100));
            } else if (gpa > 4.50 && gpa < 5.00) {
                return (int) (totalCost * (20 / 100));
            } else {
                return 0;
            }
        } catch (Exception e) {
            System.out.println("Error calculating scholarship amount: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public int calculateEarlyAdmissionCost(int baseCost) {
        try {
            double gpa = calculateGPA();
            if (gpa == 5.00) {
                return (int) (baseCost * 0.80);
            } else if (gpa > 4.50 && gpa < 5.00) {
                return (int) (baseCost * 0.40);
            } else {
                return baseCost;
            }
        } catch (Exception e) {
            System.out.println("Error calculating early admission cost: " + e.getMessage());
            return baseCost;
        }
    }

    @Override
    public double calculateGPA() {
        double gpa = 0.0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of subjects: ");
            int numberOfSubjects = scanner.nextInt();
            double totalGradePoints = 0.0;
            double totalCredits = 0.0;
            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Enter grade points for subject " + (i + 1) + ": ");
                double gradePoints = scanner.nextDouble();
                System.out.print("Enter credits for subject " + (i + 1) + ": ");
                double credits = scanner.nextDouble();
                totalGradePoints += gradePoints * credits;
                totalCredits += credits;
            }
            scanner.close();
            gpa = totalGradePoints / totalCredits;
        } catch (Exception e) {
            System.out.println("Error calculating GPA: " + e.getMessage());
        }
        return gpa;
    }
}