public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        Mustang myHorse = new Mustang();
        //Animal -->Horse -->Mustang


        
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor callled");
        color = "Brown";
    }
    void eat() { 
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changColor() {
        color = "Dark brown";
    }

    void walk() {
        System.out.println("Walks on four legs");
    }

}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Cosntructor called");
    }
}
class Chicken extends Animal {
        void changColor() {
            color = "yelllow";
    }
    void walk() {
        System.out.println("Walks on 2 legs"); 
    }
}