public class ParttimeEmployee extends Employee{
private double hours;
private double hourlyRate;

    public ParttimeEmployee(String name, int ID, int day, int month,
                             int year, double hours, double hourlyRate) {
        super(name, ID, day, month, year);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate<200)
        {
            hourlyRate = 200;
        }
    }
    @Override
    public double getSalary(){
        return hours*hourlyRate;
    }


}
