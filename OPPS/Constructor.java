public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Mahin");
        System.out.println(s1.name);
        Student s2 = new Student(5);
        System.out.println(s2.roll);
        Student s3 = new Student(0);
        


    }

} 

class Student {
    String name;
    int roll;

    Student(String name) {
        this.name = name;
        
    }
    
    Student() //Non parameterized Constructor
      {

       System.out.println("Constructor is called.....");

    }

    Student(int roll) {
        this.roll = roll;
    }
}
