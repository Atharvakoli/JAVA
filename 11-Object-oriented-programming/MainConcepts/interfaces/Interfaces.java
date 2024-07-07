package MainConcepts.interfaces;

public class Interfaces {
    public static void main(String[] args) {

    }
}

class Constants {
    public static final double PI = 3.14159;
}

interface Animal {
    void makeSound();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("dogs plays");
    }
}