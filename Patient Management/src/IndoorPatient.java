import java.util.Calendar;
class IndoorPatient extends Patient {
    private Calendar admissionDate;
    private int bedNo;
    private double dailyFee;

    public IndoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint, Calendar admissionDate, int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }

    // Setters and Getters

    public Calendar getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Calendar admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getBedNo() {
        return bedNo;
    }

    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    // Invoice calculation

    public double getInvoice() {
        Calendar currentDate = Calendar.getInstance();
        long millisecondsPerDay = 24 * 60 * 60 * 1000;
        long admissionTime = admissionDate.getTimeInMillis();
        long currentTime = currentDate.getTimeInMillis();
        int days = (int) ((currentTime - admissionTime) / millisecondsPerDay);
        return dailyFee * days;
    }

    // toString method

    @Override
    public String toString() {
        return "IndoorPatient{" +
                "admissionDate=" + admissionDate.getTime() +
                ", bedNo=" + bedNo +
                ", dailyFee=" + dailyFee +
                "} " + super.toString();
    }
}