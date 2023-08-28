class PrivateUniversity extends University {
    private boolean ugcApproved;
    private int numberOfTrusteeMember;

  

    public PrivateUniversity(String name, String address, int day, int month, int year, int numberOfDepartments,
            boolean ugcApproved, int numberOfTrusteeMember) {
        super(name, address, day, month, year, numberOfDepartments);
        this.ugcApproved = ugcApproved;
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }

    public void setUgcApproved(boolean ugcApproved) {
        this.ugcApproved = ugcApproved;
    }

    public void setNumberOfTrusteeMember(int numberOfTrusteeMember) {
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }

    public boolean isUgcApproved() {
        return ugcApproved;
    }

    public int getNumberOfTrusteeMember() {
        return numberOfTrusteeMember;
    }

    @Override
    public String toString() {
        return "PrivateUniversity [ugcApproved=" + ugcApproved + ", numberOfTrusteeMember=" + numberOfTrusteeMember
                + ", " + super.toString() + "]";
    }
}
