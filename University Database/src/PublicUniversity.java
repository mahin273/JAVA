class PublicUniversity extends University {
    private int numberOfHalls;
    private boolean politicsAllowed;




    public PublicUniversity(String name, String address,int day,int month,int year, int numberOfDepartments,
            int numberOfHalls, boolean politicsAllowed) {
        super(name, address, day,month,year, numberOfDepartments);
        this.numberOfHalls = numberOfHalls;
        this.politicsAllowed = politicsAllowed;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public void setPoliticsAllowed(boolean politicsAllowed) {
        this.politicsAllowed = politicsAllowed;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public boolean isPoliticsAllowed() {
        return politicsAllowed;
    }

    @Override
    public String toString() {
        return "PublicUniversity [numberOfHalls=" + numberOfHalls + ", politicsAllowed=" + politicsAllowed + ", "
                + super.toString() + "]";
    }
}
