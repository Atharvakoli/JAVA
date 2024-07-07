
public class oops {
    public static void main(String[] args) {
        // oop -> oop is a programming paradigm based on the concept of 'object'
        // Oop is a computer programming model that organizes software design around the
        // objects, rather than functions
        // Oop is a software design approach in which concept of 'object' occupies the
        // first place.

        // what is an object
        // -> Object, first of all, is a virtual entity with specific list of properties
        // which can distinguish it from other objects and behavior which allow to
        // manipulate with these properties
        // OBJECT -> DATA -> BEHAVIOR

        // CAR ->
        // Properties -> Doors, Body, Trunk, Sterring wheel, Headlight, wheels engine,
        // color
        // Behavior -> Turn on headlight, Stop engine, turn left, Brake, Start engine,
        // turn right, accelerate, open trunk

        // what is a class -> clas is template for objects

        // functional programming vs oop

        // functional programming
        // -> our main concept is function
        // -> works the best where you don't care about order of functions execution

        // object-oriented programming
        // -> our main concept is object
        // allows you to organize your code and program execution is structured way
        // oop advantage
        // -> Modularity, scalability, Lower cost of development, Security & Reliability
        // what is better for some imaginary business case
        // Programming is always just a question of trade-offs between maitainability,
        // scalablility, speed of development, code quatlity and reliability

        // Basic oop principles
        // -> inheritance -> Inheritance allows you to create new class based on another
        // one -> New class can extend exixting one and share properties and behaviorb
        // -> New class is called child class and basic basic class is called parent
        // class -> Inheritance allows you to reuse code and to create new classes
        // without reinventing the wheel.

        // -> encapsulation -> This key principle tells us to keep data code that can
        // manipulate this data together. It is also about keeping data and the code
        // safe from external interference
        // access modifiers - private -> you have access to fields and methods only
        // within the specific class
        // default -> within the same package, elemets with default access modifier can
        // be accessed otuside of the package
        // protected -> within the package and outside of the package in the child
        // classes access outside of the package and outside of a child class is not
        // possible
        // public -> from everywhere, You can access elements with public money, fire
        // from within the class, outside of the class, within the package and outside
        // of the package to keep focus on the basic principles

        // -> polymorphism ->
        // -> abstraction

        // what does class consist off
        // -> Constructors -> fields -> methods -> initialization blocks -> nested
        // classes

        // Different types of classes, abstract keyword and abstract classes

        // Concreate classes -> implements for all of its methods, this can have any and
        // implemented methods
        // Nested classes
        // Final classes
        // POJO classes
        // Abstract classes -> an abtract class is in case you know that your object
        // should have some specific behavior but you don't know the exact
        // implementation of this behavior for all child classes
        // Anonymous classes
        // Abstract keyword

        // Interfaces
        // What Interfaces are
        // What interface can contain
        // How to implement an interface
        // default methods
        // static methods
        // class vs interface vs type
        // What are interfaces
        // -> An Interface is an abstraction which defines a behavioral contract that
        // must be followed by every class that implements this interface, In other
        // words, you specify a set of expected behavior which should be present in each
        // class that implements this interface, But it don't specify how exactly this
        // behavior will be implemented
        // What does interface consist of
        // Abstract class -> 'extends' keyword, can have fields with all possible
        // modifiers, Can't be extended simultaneously with other classes VS Interface
        // -> 'implements' keyword, All fields are constants, Can be implemented
        // together with other interfaces

        // if you know that you need to list properties with private or protected access
        // modifiers that are not sttaic, you already know that you need to use avstract
        // class instead of interface. And if you need to be able to implement specific
        // interface together with other ones, you know that you need to use interfaces

        // Interface vs class vs type
        // Ensure that class is a template for your future object's interface is an
        // abstraction which defines application programming interface and contract for
        // behavior

        // class is a type, interface is a type. THat means every type is also is a
        // class and interface and enumeration or an array, Also each object has a type
        // and every expression has a type

        // what is type -> Type summarizes the common features of a set of objects with
        // the same characteristics
        // class is a concrete data structure and group of methods that represents an
        // implementation of the type

        // Inheritance
        // What is inheritance
        // ->
        // 'super' keyword
        // 'instanceOf' operator -> It allows you to check the type consistency with the
        // object. It is a binary operator which works with two operands
        // How to extend classes
        // How to extend Type
        // inheritance rules
        // Initialization Order of a new object

        // Polymorphism and 'final' keyword

        // what is polmorphism
        // Method overriding
        // Dynamic Binding
        // Override VS Overload
        // Dynamic binding
        // 'final' key word

        // static keyword
        // What is 'static' keyword
        // Where we can use 'static' keyword -> use static keyword during class
        // declaration with initialization locks, with methods and with properties.
        // static key word controls, variable lifetime
        // static methods
        // static fields
        // static import
        // static vs dynamic binding
        // constants

        // Encapsulation
        // What is encapsulation -> is a principle that teaches us to group data and
        // behaviour those our fields and methods together as a single unit, we can
        // control access to interfaces, classes, fields, methods to control access
        // Access modifiers
        // which modifiers to use and when
        // Rules during overrinding

        // Object
        // What is an object
        // Object class overview
        // JNI
        // 'native' keyword
        // @Deprecated annotation
        // each object in java has special methods to control interaction with objects

        // Solid Principles Overview & Single Responsibility Principle
        // What are SOLID principles
        // SOLID principles in OOP
        // Single responsiblity principle

        // S -> Single responsiblity principle -> A class should have only one reason to
        // change class, That means in case you have at least two reasons to change for
        // class, we have to split the existing functionality of current class into
        // classes. Each class is designed to serve the one single goal, and in case we
        // want to adjust the way how it works will adjust one single class in case our
        // class has multiple responsibilities. One change can inpact the way how other
        // functionality is working within the same class
        // Why do we need this.?
        // The idea behind this principle is simple, Focusing on a single concern makes
        // class more robust
        // What size of the class is optimal?
        // the class has to be small thesame as all functions, Imagine you have to
        // describe behavior of the class in one sentence
        // so one of the keywords and single responsiblity principle is responsiblity,
        // that according to words of unkillable that means that the class should have
        // only one reason for change, What the reason to change Image that we need to
        // adjust the logic of discount calculation in our system, and to change this
        // and we need to adjust three classes, discount service, cart and order
        // Responsibilty is a group of actions that serves a particular goal

        // Step to do srp
        // Identify Responsibilities:

        // Review the original code and identify areas where multiple responsibilities
        // are handled within a single class.

        // Look for actions or functionalities that can be logically grouped together
        // and separated into individual classes.

        // Create Separate Classes:

        // Once you've identified distinct responsibilities, create separate classes for
        // each one.

        // Ensure that each class has a clear and specific purpose, such as user
        // registration, authentication, or data manipulation.

        // Keep Classes Cohesive:

        // Ensure that each class focuses on a single responsibility and does not have
        // unrelated or extraneous functionality.

        // Aim for high cohesion within each class, meaning that the methods and
        // attributes are closely related and work together to achieve a common goal.

        // Define Clear Interfaces:

        // Define clear interfaces for each class to communicate with each other, if
        // necessary.

        // Use well-defined methods and parameters to facilitate communication between
        // different components of the system.

        // Test Each Component:

        // Write unit tests to verify the functionality of each class independently.

        // Test both positive and negative scenarios to ensure that each component
        // behaves as expected under different conditions.

        // Refactor Incrementally:

        // Refactor the code incrementally, focusing on one responsibility at a time.

        // Test each refactored component before moving on to the next one to ensure
        // that the changes do not introduce regressions.

        // Review and Iterate:

        // Review your refactored code regularly to ensure that it adheres to SRP
        // principles and maintains readability and maintainability.

        // Iterate on your design if necessary, making adjustments based on feedback or
        // new insights gained during the refactoring process.

        // O -> Open / closed principle
        // -> The principle states that software entities, classes, modules, functions,
        // ec should be open for extension but closed for modification
        // The first part of the principle is easy to understand and explain, module
        // will be set to be open if it still available for extension e.g, you should
        // avoid of declaring final classes, final methods, static fields and methods
        // also violate this principle
        // claso for modification doen't mean this close modification means that class
        // is defined with enough level of abstraction to extend it and create new types
        // on the basis of it, That means that interface is created in the way there is
        // no need to modify it an it is easy to extend it acheive the goal
        // The interface should have stable description
        // Closed for modification also means that extending the behavior of a module
        // doesn't result in changes to the sourse code of the module

        // L -> Liskov substitution principle
        // Objects in a program should be replaceable with instances of their subtypes
        // without altering the correctness of that program

        // I -> Interface segregation principle
        // -> NO client should be forced to depened on methods it does not use -> The
        // Interface segregation principle states that clients should not be forced to
        // depend on methods that they don't use, we should focus on creation of seeing
        // interfaces instead of creation that fat interfaces instead of declaring an
        // interface which can solve all problems and set the contract for the most of
        // business logic in your program, you should create small and specific
        // interfaces

        // D -> Dependency inversion principle
        // This principle contains two major statements
        // -> High-level modules should not depend on low-level modules. Both should
        // depend on abstractions
        // -> Abstractions should not depend on details. Details should depend on
        // abstractions.

        /*
         * WeatherAggregator -> depends -> WeatherSource <- AccuweatherApi
         * <- depends BbcWeatherApi
         */

    }
}
