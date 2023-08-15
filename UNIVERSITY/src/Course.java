import java.util.ArrayList;
public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private ArrayList<Student> studentlist = new ArrayList<>();
    private int numberOfStudents = 0;
    private ArrayList<Faculty> facultylist = new ArrayList<>();
    private int numberOfFaculty = 0;

    public Course() {
    }
    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }
    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }
    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", credit=" + credit + "]";
    }
    public void addStudent(Student s) {
        boolean flag = true;
        for (Student e : studentlist) {
            if (e.equals(s)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            studentlist.add(s);
            numberOfStudents++;
            System.out.println("Student with ID " + s.getStudentId() + " is added to the course " + this.courseId);
        } else {
            System.out.println("Student already exists!");
        }
    }
    public void dropStudent(int sid) {
        int sIndex = -1;
        for (int i = 0; i < studentlist.size(); i++) {
            if (studentlist.get(i).getStudentId() == sid) {
                sIndex = i;
                break;
            }
        }
        if (sIndex == -1)
            System.out.println("Student not found!");
        else {
            studentlist.remove(sIndex);
            numberOfStudents--;
        }
    }
    public void addFaculty(Faculty f) {
        boolean flag = true;
        for (Faculty e : facultylist) {
            if (e.equals(f)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            facultylist.add(f);
            numberOfFaculty++;
            System.out.println("Faculty with ID " + f.getFacultyId() + " is added to the course " + this.courseId);
        } else {
            System.out.println("Faculty already exists!");
        }
    }
    public void dropFaculty(int fid) {
        int fIndex = -1;
        for (int i = 0; i < facultylist.size(); i++) {
            if (facultylist.get(i).getFacultyId() == fid) {
                fIndex = i;
                break;
            }
        }
        if (fIndex == -1)
            System.out.println("Faculty not found!");
        else {
            facultylist.remove(fIndex);
            numberOfFaculty--;
        }
    }
    public void printStudentList() {
        System.out.println("The students of " + this.courseId + " are: ");
        for (Student e : studentlist) {
            System.out.println(e);
        }
    }
    public ArrayList<Faculty> getFacultylist() {
        return facultylist;
    }
    public Student findMaxCgpa() {
        Student max = studentlist.get(0);
        for (Student e : studentlist) {
            if (e.getStudentCgpa() > max.getStudentCgpa()) {
                max = e;
            }
        }
        return max;
    }
    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }
    public String getFacultyId() {
        StringBuilder facultyIds = new StringBuilder();
        for (Faculty faculty : facultylist) {
            facultyIds.append(faculty.getFacultyId()).append(", ");
        }
        return facultyIds.toString();
    }

    public boolean equals(Course c) {
        return this.courseId.equals(c.courseId) && this.courseTitle.equals(c.courseTitle) && this.credit == c.credit;
    }


}