public class FulltimeEmployee extends Employee{
    private double monthlySalary;

    public FulltimeEmployee(String name, int ID, int day, int month,
                            int year, double monthlySalary) {
        super(name, ID, day, month, year);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double getSalary(){
        return monthlySalary;
    }
}
