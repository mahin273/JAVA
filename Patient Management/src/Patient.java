class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private int systolic;
    private int diastolic;
    private double diabetesPoint;

    public Patient(String name, int age, int systolic, int diastolic, double diabetesPoint) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.diabetesPoint = diabetesPoint;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public double getDiabetesPoint() {
        return diabetesPoint;
    }

    public void setDiabetesPoint(double diabetesPoint) {
        this.diabetesPoint = diabetesPoint;
    }

    // toString method

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", systolic=" + systolic +
                ", diastolic=" + diastolic +
                ", diabetesPoint=" + diabetesPoint +
                '}';
    }

    public double getInvoice() {
        return 0;
    }

    // Comparable interface implementation

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.getAge(), this.getAge());
    }
}