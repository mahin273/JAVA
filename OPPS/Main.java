class Animal {
    String name;
     Animal(String name) {
        this.name = name;
    }
     void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
 class Dog extends Animal {
    String breed;
     Dog(String name, String breed) {
        super(name); // Invoking superclass constructor
        this.breed = breed;
    }
     @Override
    void makeSound() {
        super.makeSound(); // Invoking superclass method
        System.out.println("Dog barks");
    }
}
 public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Labrador");
        myDog.makeSound();
    }
}