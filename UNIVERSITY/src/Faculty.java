public class Faculty {
    private int FacultyId;
    private String facultyName;
    private String facultyPosition;
    public Faculty() {
    }
    public Faculty(int FacultyId, String facultyName, String facultyPosition) {
        this.FacultyId = FacultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }
    public int getFacultyId() {
        return FacultyId;
    }
    public void setFacultyId(int facultyId) {
        this.FacultyId = facultyId;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    public String getFacultyPosition() {
        return facultyPosition;
    }
    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }
    @Override
    public String toString() {
        return "Faculty [facultyId=" + FacultyId + ", facultyName=" + facultyName + ", facultyPosition="
                + facultyPosition + "]";
    }
    public boolean equals(Faculty f){
        return this.FacultyId == f.FacultyId
            && this.facultyName.equals(f.facultyName)
            && this.facultyPosition.equals(f.facultyPosition);
    }
    
}
