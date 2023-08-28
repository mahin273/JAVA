class OutdoorPatient extends Patient {
    private String speciality;
    private double consultationFee;

    public OutdoorPatient(String name, int age, int systolic, int diastolic, double diabetesPoint, String speciality, double consultationFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.speciality = speciality;
        this.consultationFee = consultationFee;
    }

    // Setters and Getters

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    // Invoice calculation

    public double getInvoice() {
        return consultationFee;
    }

    // toString method

    @Override
    public String toString() {
        return "OutdoorPatient{" +
                "speciality='" + speciality + '\'' +
                ", consultationFee=" + consultationFee +
                "} " + super.toString();
    }
}