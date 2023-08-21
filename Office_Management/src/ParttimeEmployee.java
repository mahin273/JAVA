class ParttimeEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public ParttimeEmployee(String name, int id, int day, int month, int year, int hours, double hourlyRate) {
        super(name, id, day, month, year);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHourlyRate() {
        if (hourlyRate < 200) {
            hourlyRate = 200;
        }
    }

    public int getHours() {
        return hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double getSalary() {
        return hours * hourlyRate;
    }
}