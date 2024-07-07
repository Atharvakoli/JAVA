package MainConcepts.inheritance;

public class Inheritance {
    // Inheritance is a mechanism wherein a new class (child or subclass) inherits
    // properties and behaviors (methods) from an existing class (parent or
    // superclass). It promotes code reuse.

    // Real-life Example:
    // Consider vehicles. All vehicles share common features like wheels, engines,
    // and the ability to move. However, a car and a bicycle have specific
    // attributes and behaviors in addition to the common ones.
    public static void main(String[] args) {

        // Car bukati = new Car("bukate", 2);
        // bukati.move();
        // bukati.honk();

        Vehicle motorCycle = new Car("pulsor", 2);

        System.out.println(motorCycle.brand);
        motorCycle.move();
        // motorCycle.honk();

    }

}

class Vehicle {
    protected String brand;

    public void move() {
        System.out.println("The Vehicle is moving");
    }
}

class Car extends Vehicle {
    private int seats;

    public Car(String brand, int seats) {
        this.brand = brand;
        this.seats = seats;
    }

    public void honk() {
        System.out.println("The car is honking ");
    }
}
