public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mahin";
        s1.roll = 4;
        s1.password = "abcdef";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    class Address {
        String city;
    }

    // shallow copy cosntructor-
    // Student(Student s1) {
    // marks = new int[3];
    // this.marks = s1.marks;
    // this.name = s1.name;
    // this.roll = s1.roll;

    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;

    }

    Student() // Non parameterized Constructor
    {
        marks = new int[3];

        System.out.println("Constructor is called.....");

    }

    Student(int roll) {
        this.roll = roll;
    }
}
