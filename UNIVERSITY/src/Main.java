import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Faculty> faculties = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void addAStudent() {
        System.out.println("ID: ");
        int id = input.nextInt();
        System.out.println("Name: ");
        String name = input.next();
        System.out.println("CGPA: ");
        double cg = input.nextDouble();
        Student s = new Student(id, name, cg);
        boolean flag = true;
        for (Student e : students) {
            if (e.equals(s)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            students.add(s);
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Already exists!");
        }
    }


    public static void addAFaculty() {
        System.out.println("ID: ");
        int id = input.nextInt();
        System.out.println("Name: ");
        String name = input.next();
        System.out.println("Position: ");
        String pos = input.next();
        Faculty f = new Faculty(id, name, pos);
        boolean flag = true;
        for (Faculty e : faculties) {
            if (e.equals(f)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            faculties.add(f);
            System.out.println("Faculty added successfully!");
        } else {
            System.out.println("Already exists!");
        }
    }

    public static void addACourse() {
        System.out.println("Course code: ");
        String code = input.next();
        System.out.println("Course title: ");
        String name = input.next();
        System.out.println("Credit: ");
        double cred = input.nextDouble();
        Course c = new Course(code, name, cred);
        boolean flag = true;
        for (Course e : courses) {
            if (e.equals(c)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            courses.add(c);
            System.out.println("Course added successfully!");
        } else {
            System.out.println("Already exists!");
        }
    }
    public static void addAFacultyCourse() {
        System.out.println("Faculty ID: ");
        int fid = input.nextInt();
        System.out.println("Course code: ");
        String code = input.next();
        int courseIndex = -1, facultyIndex = -1;
        for (int i = 0; i < faculties.size(); i++) {
            if (faculties.get(i).getFacultyId() == fid) {
                facultyIndex = i;
                break;
            }
        }
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(code)) {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex != -1 && facultyIndex != -1) {
            courses.get(courseIndex).addFaculty(faculties.get(facultyIndex));
        } else {
            System.out.println("Error!");
        }
    }

    public static void addAStudentCourse(){
        System.out.println("Student ID: ");
        int sid = input.nextInt();
        System.out.println("Course code: ");
        String code = input.next();
        int courseIndex = -1, studentIndex = -1;
        for(int i = 0; i<students.size(); i++){
            if(students.get(i).getStudentId() == sid){
                studentIndex = i;
                break;
            }
        }
        for(int i = 0; i<courses.size(); i++){
            if(courses.get(i).getCourseId().equals(code)){
                courseIndex = i;
                break;
            }
        }
        if(courseIndex != -1 && studentIndex !=-1){
            courses.get(courseIndex).addStudent(students.get(studentIndex));
        }
        else{
            System.out.println("Error!");
        }
    }
    public static void deleteAStudent() {
        System.out.println("ID: ");
        int id = input.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == id) {
                students.remove(i);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
    public static void deleteAFaculty() {
        System.out.println("ID: ");
        int id = input.nextInt();
        for (int i = 0; i < faculties.size(); i++) {
            if (faculties.get(i).getFacultyId() == id) {
                faculties.remove(i);
                System.out.println("Faculty removed successfully!");
                return;
            }
        }
        System.out.println("Faculty not found!");
    }
    public static void deleteACourse() {
        System.out.println("Course code: ");
        String code = input.next();
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(code)) {
                courses.remove(i);
                System.out.println("Course removed successfully!");
                return;
            }
        }
        System.out.println("Course not found!");
    }
    public static void deleteAStudentCourse() {
        System.out.println("Student ID: ");
        int sid = input.nextInt();
        System.out.println("Course code: ");
        String code = input.next();
        for (Course c : courses) {
            if (c.getCourseId().equals(code)) {
                c.dropStudent(sid);
                return;
            }
        }
        System.out.println("Course not found!");
    }
    public static void updateAStudent() {
        System.out.println("Enter the ID of the student you want to update: ");
        int id = input.nextInt();
        for (Student s : students) {
            if (s.getStudentId() == id) {
                System.out.println("Enter new name: ");
                String newName = input.next();
                System.out.println("Enter new CGPA: ");
                double newCgpa = input.nextDouble();
                s.setStudentName(newName);
                s.setStudentCgpa(newCgpa);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
    public static void updateAFaculty() {
        System.out.println("Enter the ID of the faculty you want to update: ");
        int id = input.nextInt();
        for (Faculty f : faculties) {
            if (f.getFacultyId() == id) {
                System.out.println("Enter new name: ");
                String newName = input.next();
                System.out.println("Enter new position: ");
                String newPosition = input.next();
                f.setFacultyName(newName);
                f.setFacultyPosition(newPosition);
                System.out.println("Faculty updated successfully!");
                return;
            }
        }
        System.out.println("Faculty not found!");
    }
    public static void updateACourse() {
        System.out.println("Enter the course code of the course you want to update: ");
        String code = input.next();
        for (Course c : courses) {
            if (c.getCourseId().equals(code)) {
                System.out.println("Enter new course title: ");
                String newTitle = input.next();
                System.out.println("Enter new credit: ");
                double newCredit = input.nextDouble();
                c.setCourseTitle(newTitle);
                c.setCredit(newCredit);
                System.out.println("Course updated successfully!");
                return;
            }
        }
        System.out.println("Course not found!");
    }
    public static void searchAStudent() {
        System.out.println("ID: ");
        int id = input.nextInt();
        for (Student s : students) {
            if (s.getStudentId() == id) {
                System.out.println(s.toString());
                return;
            }
        }
        System.out.println("Student not found!");
    }
    public static void searchAFaculty() {
        System.out.println("ID: ");
        int id = input.nextInt();
        for (Faculty f : faculties) {
            if (f.getFacultyId() == id) {
                System.out.println(f.toString());
                return;
            }
        }
        System.out.println("Faculty not found!");
    }
    public static void searchACourse() {
        System.out.println("Course code: ");
        String code = input.next();
        for (Course c : courses) {
            if (c.getCourseId().equals(code)) {
                System.out.println(c.toString());
                return;
            }
        }
        System.out.println("Course not found!");
    }
    public static void searchStudentCourse() {
        System.out.println("Student ID: ");
        int sid = input.nextInt();
        System.out.println("Course code: ");
        String code = input.next();
        for (Course c : courses) {
            if (c.getCourseId().equals(code)) {
                for (Student s : c.getStudentlist()) {
                    if (s.getStudentId() == sid) {
                        System.out.println("Student is taking this course.");
                        return;
                    }
                }
            }
        }
        System.out.println("Student is not taking this course or Course not found!");
    }
    public static void searchFacultyCourse() {
        System.out.println("Faculty ID: ");
        int fid = input.nextInt();
        System.out.println("Course code: ");
        String code = input.next();
        for (Course c : courses) {
            if (c.getCourseId().equals(code)) {
                for (Faculty f :c.getFacultylist()){
                if (f.getFacultyId() == fid) {
                    System.out.println("Faculty is teaching this course.");
                    return;
                    }
                }
            }
        }
        System.out.println("Faculty is not teaching this course or Course not found!");
    }
    public static void printCourseStudents(){
        System.out.println("Course code: ");
        String code = input.next();
        for(Course c: courses){
            if(c.getCourseId().equals(code)){
                c.printStudentList();
            }
        }
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add\n2. Delete\n3. Update\n4. Search\n5. Print\n0. Exit");
            int x = input.nextInt();
            if (x == 0)
                break;
            else if (x == 1) {
                System.out.println("a. Add a student\nb. Add a faculty\nc. Add a course\nd. Add a student to a course\ne. Add a faculty to a course\nz. Return to main menu");
                char y = input.next().charAt(0);
                if (y == 'a') {
                    addAStudent();
                }
                else if(y=='b'){
                    addAFaculty();
                }
                else if(y=='c'){
                    addACourse();
                }
                else if(y=='d'){
                    addAStudentCourse();

                }
                else if(y=='e'){
                    addAFacultyCourse();
                }
            }
            else if (x == 2) {
                System.out.println("a. Delete a student\nb. Delete a faculty\nc. Delete a course\nd. Delete a student from a course\nz. Return to main menu");
                char y = input.next().charAt(0);
                if (y == 'a') {
                    deleteAStudent();
                }
                else if (y == 'b') {
                    deleteAFaculty();
                }
                else if (y == 'c') {
                    deleteACourse();
                }
                else if (y == 'd') {
                    deleteAStudentCourse();
                }
            }
            else if (x == 3) {
                System.out.println("a. Update a student\nb. Update a faculty\nc. Update a course\nz. Return to main menu");
                char y = input.next().charAt(0);
                if (y == 'a') {
                    updateAStudent();
                }
                else if (y == 'b') {
                    updateAFaculty();
                }
                else if (y == 'c') {
                    updateACourse();
                }
            }
            else if (x == 4) {
                System.out.println("a. Search a student\nb. Search a faculty\nc. Search a course\nd. Search whether a student takes a course\ne. Search whether a faculty teaches a course\nf. Search Courses taken by a student\ng. Search courses taught by a faculty");
                char y = input.next().charAt(0);
                if (y == 'a') {
                    searchAStudent();
                }
                else if (y == 'b') {
                    searchAFaculty();
                }
                else if (y == 'c') {
                    searchACourse();
                }
                else if (y == 'd') {
                    searchStudentCourse();
                }
                else if (y == 'e') {
                    searchFacultyCourse();
                }
                else if(y== 'f'){
                searchStudentCourse();
                }
                else if(y =='g'){
                searchFacultyCourse();
                }
            }
            else if(x==5){
                System.out.println("a. Print  all students\nb. Print all courses\nc. Print all faculties\nd. Print information of a student\ne. Print information of a course\f. Print information of a faculty\ng. Print student list and faculty information of a course\nh. Print courses taken by a student");
                char y = input.next().charAt(0);
                if(y=='a'){
                    for(Student s: students){
                        System.out.println(s.toString());
                    }
                }
                else if(y=='b'){
                    for(Course c: courses){
                        System.out.println(c.toString());
                    }
                }
                else if(y=='c'){
                    for(Faculty f: faculties){
                        System.out.println(f.toString());
                    }
                }
                else if(y=='d'){
                    printCourseStudents();
                }
                else if(y== 'e'){


                }
                else if(y=='f'){

                }
                else if(y=='g'){

                }
                else if(y=='h'){


                }
            }
        }
    }
}
