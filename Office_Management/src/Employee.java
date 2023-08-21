
import java.util.Calendar;


class Employee {
    private String name;
    private int id;
    private Calendar dateOfBirth;

    public Employee(String name, int id, int day, int month, int year) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = Calendar.getInstance();
        this.dateOfBirth.set(year, month - 1, day);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(int day, int month, int year) {
        this.dateOfBirth.set(year, month - 1, day);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return 0; // Base implementation, to be overridden in subclasses
    }
}