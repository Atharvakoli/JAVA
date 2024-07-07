/*
 * Class and Object:
 * 
 * Class: A blueprint for objects. Object: An instance of a class.
 * 
 * Method Overriding: Allows a subclass to provide a specific implementation for
 * a method that is already defined in its superclass.
 * 
 * Method Overloading: Multiple methods can have the same name with different
 * parameters.
 * 
 * Constructor: A special method invoked when an object is instantiated.
 * 
 * Access Modifiers: Control the visibility of class members (e.g., private,
 * protected, public).
 * 
 * Association: Association represents the relationship between two classes. It
 * can be of
 * several types such as one-to-one, one-to-many, many-to-one, and many-to-many.
 * Example:
 * A Library has multiple Books.
 * Aggregation: Aggregation is a special form of association where a class can
 * have a reference to objects of another class, and those objects can exist
 * independently of the containing class.
 * Example:
 * A Department has Professors.
 * 
 * Composition:
 * 
 * Composition is a more restrictive form of aggregation where the contained
 * objects cannot exist independently of the containing class.
 * Example:
 * A House has Rooms.
 * 
 * Dependency:
 * 
 * Dependency represents a "uses-a" relationship where one class depends on
 * another class to function. It is a weaker relationship compared to
 * association, aggregation, or composition.
 * Example:
 * A Car depends on an Engine to run.
 * 
 * 
 * Additional Rules
 * Open/Closed Principle:
 * 
 * Classes should be open for extension but closed for modification. This means
 * you should be able to add new functionality to a class without changing its
 * existing code.
 * Single Responsibility Principle:
 * 
 * A class should have only one reason to change, meaning it should have only
 * one job or responsibility.
 * Liskov Substitution Principle:
 * 
 * Subtypes must be substitutable for their base types without altering the
 * correctness of the program. This means that objects of a superclass should be
 * replaceable with objects of a subclass without affecting the functionality.
 * Interface Segregation Principle:
 * 
 * Clients should not be forced to depend on methods they do not use. This means
 * that interfaces should be small and specific rather than large and general.
 * Dependency Inversion Principle:
 * 
 * High-level modules should not depend on low-level modules. Both should depend
 * on abstractions. Abstractions should not depend on details. Details should
 * depend on abstractions.
 * Law of Demeter (Principle of Least Knowledge):
 * 
 * A module should not know about the internal details of the objects it
 * interacts with. It should only communicate with its immediate friends
 * (closely related objects).
 * 
 * 
 * More Advanced Concepts
 * 
 * Abstract Classes and Methods:
 * 
 * An abstract class cannot be instantiated and may contain abstract methods
 * (methods without a body) that must be implemented by subclasses.
 * 
 * Interfaces:
 * 
 * Interfaces in Java are abstract types that allow the specification of methods
 * that a class must implement. A class can implement multiple interfaces.
 * 
 * Static and Final Keywords:
 * 
 * static: Indicates that a member belongs to the class rather than instances of
 * the class.
 * final: Indicates that a variable's value cannot be changed, a method cannot
 * be overridden, or a class cannot be subclassed.
 * 
 * Interfaces and Multiple Inheritance
 * Java does not support multiple inheritance (a class cannot inherit from more
 * than one class). However, a class can implement multiple interfaces, allowing
 * for a form of multiple inheritance.
 * 
 * 
 * OOP in Java encompasses a wide range of concepts and rules beyond the basic
 * principles of encapsulation, inheritance, polymorphism, and abstraction.
 * These include the use of interfaces and multiple inheritance, abstract
 * classes, method overloading and overriding, static methods and variables,
 * final classes and methods, inner and anonymous classes, and generics. Each of
 * these concepts plays a crucial role in creating flexible, reusable, and
 * maintainable code.
 * 
 * Abstract Classes vs. Interfaces
 * While both abstract classes and interfaces can be used to achieve abstraction
 * in Java, there are key differences. Abstract classes can have method
 * implementations and state (fields), whereas interfaces can only declare
 * methods until Java 8. From Java 8 onwards, interfaces can have default and
 * static methods with implementations.
 * 
 * Method Overloading and Method Overriding
 * Method Overloading:
 * Method overloading allows a class to have more than one method with the same
 * name, but with different parameters (either type or number of parameters).
 * 
 * Method Overriding:
 * Method overriding allows a subclass to provide a specific implementation for
 * a method that is already defined in its superclass.
 * 
 * Static Methods and Variables
 * Static methods and variables belong to the class rather than instances of the
 * class. They can be accessed without creating an instance of the class.
 * 
 * Final Classes and Methods
 * The final keyword in Java can be used to mark a class as unextendable (cannot
 * be subclassed), or to prevent a method from being overridden by subclasses.
 * public final class Constants {
 * public static final String COMPANY_NAME = "Tech Corp";
 * }
 * class Animal {
 * public final void eat() {
 * System.out.println("Animal eats");
 * }
 * }
 * 
 * class Dog extends Animal {
 * // This will cause a compile-time error because eat() is final in Animal
 * // public void eat() {
 * // System.out.println("Dog eats");
 * // }
 * }
 * 
 * Anonymous Classes
 * Anonymous classes are a form of inner class with no name. They are useful for
 * creating quick, one-time-use class implementations.
 * 
 * Generics
 * Generics provide a way to create classes, interfaces, and methods with a
 * placeholder for types. They increase the reusability of code and provide type
 * safety by catching type errors at compile time.
 * 
 * These include the use of interfaces and multiple inheritance, abstract
 * classes, method overloading and overriding, static methods and variables,
 * final classes and methods, inner and anonymous classes, and generics. Each of
 * these concepts plays a crucial role in creating flexible, reusable, and
 * maintainable code.
 */