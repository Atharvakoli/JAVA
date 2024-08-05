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

        // Another example
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);

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

class Box {
    double width;
    double height;
    double depth;

    // construct clone of an object
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {

    // Chapter 8 Inheritance 165 Part I
    double weight; // weight of box
    // constructor for BoxWeight

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
