class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String name, int id, int day, int month, int year, double monthlySalary) {
        super(name, id, day, month, year);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double getSalary() {
        return monthlySalary;
    }
}
