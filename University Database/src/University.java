import java.util.Calendar;

class University implements Comparable<University> {
    private String name;
    private String address;
    private Calendar dateOfEstablished;
    private int numberOfDepartments;

    public University(String name, String address, int day, int month, int year, int numberOfDepartments) {
        this.name = name;
        this.address = address;
        this.dateOfEstablished = Calendar.getInstance();
        this.dateOfEstablished.set(year, month - 1, day); // Corrected order of parameters
        this.numberOfDepartments = numberOfDepartments;
    }
  

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfEstablished(Calendar dateOfEstablished) {
        this.dateOfEstablished = dateOfEstablished;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Calendar getDateOfEstablished() {
        return dateOfEstablished;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    @Override
    public String toString() {
        int day = dateOfEstablished.get(Calendar.DAY_OF_MONTH);
        int month = dateOfEstablished.get(Calendar.MONTH) + 1;
        int year = dateOfEstablished.get(Calendar.YEAR);
        return "University [name=" + name + ", address=" + address + ", dateOfEstablished=" + day + "/" + month + "/"
                + year
                + ", numberOfDepartments=" + numberOfDepartments + "]";
    }

    @Override
    public int compareTo(University other) {
        return other.getDateOfEstablished().compareTo(this.getDateOfEstablished());
    }
}