

public class Hierarchial {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
      Fish nemo = new Fish();
        nemo.eat();
        nemo.breathe();
        

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

    class Fish extends Animal {
    void swim() {
       System.out.println("Swim"); 
    }
}

class Bird extends Animal {
    void fly() {
       System.out.println("fly"); 
    }
}
