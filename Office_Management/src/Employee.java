import java.util.Calendar;

public class Employee {
    private String name;
    private int ID;
    private Calendar dateOfBirth;

    public Employee(String name, int ID, int day,int month, int year) {
        this.name = name;
        this.ID = ID;
        this.dateOfBirth = Calendar.getInstance();

        this.dateOfBirth.set(day,month-1,year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int day,int month, int year) {
        this.dateOfBirth.set(day,month-1,year);
    }
    public double getSalary(){
       return 0;
    }
}
