public class ClassesAndObjects {
    public static void main(String[] args) {

        Pen p1 = new Pen(); //Created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // another method
        p1.color = "Red";
        System.out.println(p1.color);
        BankAccount myAcc = new BankAccount();
        myAcc.unsername = "MahinKhan";
        myAcc.setPassword("mkhgfbv");

    }   

}

class BankAccount {
    public String unsername;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
      }    
}

class Pen {
    String color; 
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;

    }

}
