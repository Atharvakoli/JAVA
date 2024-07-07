package MainConcepts.abstraction;

public class Abstraction {
    // Abstraction involves hiding the complex implementation details of a system
    // and exposing only the necessary parts. It helps in reducing programming
    // complexity and effort.

    // Real-life Example:
    // Consider a TV remote. You use it to change channels, adjust volume, etc.,
    // without knowing the internal workings of the remote or the TV.

    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }

}

abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}