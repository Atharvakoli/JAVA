package MainConcepts.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism allows methods to do different things based on the object it is
        // acting upon, even though they share the same name. This can be achieved
        // through method overriding and method overloading.

        // Real-life Example:
        // Consider a person interacting with different devices. Pressing a button on a
        // TV turns it on, while pressing a button on a radio changes the station. The
        // action is the same (pressing a button), but the behavior is different.

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();

    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
