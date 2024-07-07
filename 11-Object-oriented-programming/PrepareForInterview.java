public class PrepareForInterview {
    /*
     * Part 1: OOP Interview - Questions and Answers
     * WHAT IS OOP?
     * 
     * 
     * 
     * OOP is a programming methodology based on the representation of a software
     * product as a collection of objects, each of which is an instance of a
     * particular class. Object takes the main place in this software design
     * approach. Object can be described as data structure (some state) plus some
     * behavior to modify and interact with this data (state). OOP uses the
     * interaction of objects as its basic elements.
     * 
     * 
     * 
     * 
     * 
     * WHAT IS AN OBJECT?
     * 
     * 
     * 
     * An object is a named model of a real entity that has specific property values
     * and manifests its behavior. Object has a set of data (fields and properties
     * of an object) taht is physically located in the computer's memory. Also,
     * object has methods that have access to the data (fields and properties). An
     * object is a concrete instance of a class.
     * 
     * 
     * 
     * 
     * 
     * NAME THE BASIC PRINCIPLES OF OOP.
     * 
     * 
     * 
     * It is generally accepted that object-oriented programming is based on 4 basic
     * principles (there were only 3 before). These principles are:
     * 
     * (Abstraction)
     * 
     * Encapsulation
     * 
     * Inheritance
     * 
     * Polymorphism
     * 
     * 
     * 
     * 
     * 
     * WHAT IS INHERITANCE?
     * 
     * 
     * 
     * Inheritance is the process by which you can describe one type based on the
     * other type. Also, during the inheritance, one object can acquire the
     * properties of another object (inheritance of all the properties of one object
     * by another)
     * 
     * and add features characteristic only of himselfю
     * 
     * 
     * 
     * class Dog extends Animal
     * 
     * {...}
     * 
     * Superclass -> Subclass
     * 
     * Parent -> Child
     * 
     * 
     * 
     * 
     * 
     * WHAT IS POLYMORPHISM? WHAT MANIFESTATIONS OF POLYMORPHISM IN JAVA DO YOU
     * KNOW?
     * 
     * 
     * 
     * Polymorphism (from the Greek polymorphos) is a property that allows the same
     * name to be used to solve two or more similar but technically different tasks.
     * The goal of polymorphism, as applied to object-oriented programming, is to
     * use a single name to define common actions for a class. The execution of each
     * specific action will be determined by the data type.
     * 
     * More generally, the concept of polymorphism is the idea of
     * ​​"one interface, many methods". This means that you can create a common
     * interface for a group of similar actions.
     * 
     * 
     * 
     * For example, you have an acceleration pedal on an electric car and on a car
     * with a gasoline engine. In both cases, pressing the acceleration pedal would
     * bring us the same result - the car will go faster. But the way how exactly
     * acceleration will be implemented in electric and non-electric cars - will be
     * different because of the different car construction.
     * 
     * 
     * 
     * 
     * 
     * WHAT IS ENCAPSULATION?
     * 
     * 
     * 
     * Encapsulation (encapsulation) - this is hiding the implementation of a class
     * and separating its internal representation from the external (interface),
     * this is a property that allows you to close access to the fields and methods
     * of the class to other classes, and provide them with access only through the
     * external interface (methods). When using an object-oriented approach, it is
     * not ok to directly access the properties of a class from the methods of other
     * classes. To access the properties of a class, usually you need to use special
     * methods of this class to get and change its properties.
     * 
     * 
     * 
     * 
     * 
     * WHAT ARE THE ADVANTAGES OF OBJECT-ORIENTED PROGRAMMING LANGUAGES?
     * 
     * 
     * 
     * 1. Modularity for easier troubleshooting
     * 
     * When working with object-oriented programming languages, you know exactly
     * where to look when something goes wrong. “Oh, the car object broke down? The
     * problem must be in the Car class!” You don’t have to go line-by-line through
     * all your code.
     * 
     * 
     * 
     * That’s the beauty of encapsulation. Objects are self-contained, and each bit
     * of functionality does its own thing while leaving the other bits alone. Also,
     * this modularity allows an IT team to work on multiple objects simultaneously
     * while minimizing the chance that one person might duplicate someone else’s
     * functionality.
     * 
     * 
     * 
     * 2. Reuse of code through inheritance
     * 
     * Suppose that in addition to your Car object, one colleague needs a RaceCar
     * object, and another needs a Limousine object. Everyone builds their objects
     * separately but discover commonalities between them. In fact, each object is
     * just a different kind of Car. This is where the inheritance technique saves
     * time: Create one generic class (Car), and then define the subclasses (RaceCar
     * and Limousine) that are to inherit the generic class’s traits.
     * 
     * 
     * 
     * Of course, Limousine and RaceCar still have their unique attributes and
     * functions. If the RaceCar object needs a method to “fireAfterBurners” and the
     * Limousine object requires a Chauffeur, each class could implement separate
     * functions just for itself. However, because both classes inherit key aspects
     * from the Car class, for example the “drive” or “fillUpGas” methods, your
     * inheriting classes can simply reuse existing code instead of writing these
     * functions all over again.
     * 
     * 
     * 
     * What if you want to make a change to all Car objects, regardless of type?
     * This is another advantage of the OOP approach. Make a change to your Car
     * class, and all car objects will simply inherit the new code.
     * 
     * 
     * 
     * 3. Flexibility through polymorphism
     * 
     * Riffing on this example, you now need just a few drivers, or functions, like
     * “driveCar,” driveRaceCar” and “DriveLimousine.” RaceCarDrivers share some
     * traits with LimousineDrivers, but other things, like RaceHelmets and
     * BeverageSponsorships, are unique.
     * 
     * 
     * 
     * This is where object-oriented programming’s polymorphism comes into play.
     * Because a single function can shape-shift to adapt to whichever class it’s
     * in, you could create one function in the parent Car class called “drive” —
     * not “driveCar” or “driveRaceCar,” but just “drive.” This one function would
     * work with the RaceCarDriver, LimousineDriver and so on. In fact, you could
     * even have “raceCar.drive(myRaceCarDriver)” or “limo.drive(myChauffeur).”
     * 
     * 
     * 
     * 4. Effective problem solving
     * 
     * Many people avoid learning OOP because the learning curve seems steeper than
     * that for top-down programming. But take the time to master OOP and you’ll
     * find it’s the easier, more intuitive approach for developing big projects.
     * 
     * 
     * 
     * Object-oriented programming is ultimately about taking a huge problem and
     * breaking it down to solvable chunks. For each mini-problem, you write a class
     * that does what you require. And then — best of all — you can reuse those
     * classes, which makes it even quicker to solve the next problem.
     * 
     * 
     * 
     * This isn’t to say that OOP is the only way to write software. But there’s a
     * reason that languages like C++, C# and Java are the go-to options for serious
     * software development.
     * 
     * 
     * 
     * 
     * 
     * WHAT ARE THE DISADVANTAGES OF THE OOP APPROACH?
     * 
     * 
     * 
     * Steep expectation to learn and adapt: The perspective engaged with
     * object-situated programming may not be normal for certain individuals, and it
     * can invest in some opportunity to become accustomed to it. It is complex to
     * make programs in view of the cooperation of articles. A portion of the key
     * programming procedures, like inheritance and polymorphism, can be tested to
     * appreciate at first.
     * 
     * Bigger program size: Object-arranged programs commonly include more lines of
     * code than procedural projects.
     * 
     * More slow projects: Object-arranged programs are normally slower than
     * procedure-based programs, as they ordinarily require more guidelines to be
     * executed.
     * 
     * Programmers need to have brilliant designing skill and programming skill
     * along with proper planning because using OOP is little bit tricky.
     * 
     * 
     * 
     * 
     * 
     * THERE IS THE EXPRESSION "IS" AND "HAS". WHAT DO THEY MEAN IN TERMS OF OOP
     * PRINCIPLES? WHAT IS THE DIFFERENCE BETWEEN COMPOSITION AND AGGREGATION?
     * 
     * 
     * 
     * "is" - inheritance
     * 
     * "has" - composition
     * 
     * 
     * 
     * As an example, let's say we have the classes Building, House, and Bathroom.
     * So the House is a building, which cannot be said about Bath, which is not a
     * house. But the House has \ includes a Bath. If you want to reuse code, then
     * you don't have to use inheritance. If there is no "is" relationship, then
     * it's better to use composition to reuse code.
     * 
     * 
     * 
     * Don't use inheritance to get polymorphism if there is no "is" key dependency.
     * Use interfaces for polymorphism.
     * 
     * 
     * 
     * From the specification, you can see that
     * 
     * An association denotes a relationship between objects.
     * 
     * Aggregation and composition are special cases of association.
     * 
     * Aggregation assumes that objects are related in a "part-of" relationship.
     * 
     * Composition is a more rigorous variant of aggregation. In addition to the
     * part-of requirement, a condition is imposed that a "part" cannot belong to
     * different "owners" at the same time, and ends its existence together with the
     * owner.
     * 
     * 
     * 
     * For example:
     * 
     * motorcycle -> luggage bag - association. The relation "has".
     * 
     * motorcycle -> wheel - composition.
     * 
     * interest group -> person - aggregation. a person is part of a group, but may
     * belong to several different groups.
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * WHAT DO YOU MEAN BY POLYMORPHISM, ENCAPSULATION AND DYNAMIC BINDING?
     * 
     * 
     * 
     * Polymorphism refers to the ability of a variable of a given type to refer to
     * objects of different types by calling a method that is specific to the
     * particular type of object reference.
     * 
     * 
     * 
     * What is the advantage of polymorphism? It allows you to add new derived
     * object classes without breaking the calling code. The use of polymorphism is
     * also called dynamic object binding.
     * 
     * 
     * 
     * Consider an example of polymorphism:
     * 
     * There are classes: Shape, circle and triangle.
     * 
     * The circle and triangle are inherited from the shape, respectively. Each
     * class has a "draw" method. In circle and triangle, this method is overridden.
     * 
     * So, we create an object with the "Shape" type and assign it a reference to an
     * object of the "Circle" type and call the "draw" method on this object. As a
     * result, the method of the class "Circle" is called, and not the class "Shape"
     * as expected.
     * 
     * 
     * 
     * Figure f = new Circle();
     * 
     * f.draw();
     * 
     * 
     * 
     * Also, instead of the "Shape" parent class, for example, you can use the
     * "Shape" interface, defining the draw method there. We implement this
     * interface in the "Circle" and "Triangle" classes. Next, we create an object
     * on the interface and assign it a reference to an object of some of the
     * classes that implement this interface.
     * 
     * 
     * 
     * We can say that we encapsulate behavior of drawShape() method.
     * 
     * 
     * 
     * This is convenient, for example, if we have a certain method:
     * 
     * 
     * 
     * public void drawShape(Shape f){
     * 
     * f.draw();
     * 
     * }
     * 
     * 
     * 
     * Please note that we are passing a parameter with the interface type to the
     * method, i.e. we do not know what type of object will be there, but there is
     * will be the implementation of such behavior behind the object. Further, we
     * can simply create another class, for example, "Trapezoid", implement the
     * "Shape" interface and simply pass an instance of the class to the method
     * without changing anything in the implementation and call.
     * 
     * 
     * 
     * Definition of which exactly method will be invoked during the runtime,
     * depending on which object will stand behind the reference - that is called
     * dynamic binding.
     * 
     * 
     * 
     * 
     * Part 2: OOP Interview - Questions and Answers
     * DESCRIBE ACCESS MODIFIERS IN JAVA.
     * 
     * 
     * 
     * Java has the following access modifiers:
     * 
     * private: (used in constructors, inner classes, methods and class fields) -
     * Access is allowed only in the current class.
     * 
     * default (package-private): (used in classes, constructors, interfaces, inner
     * classes, methods and class fields) - Package level access. If the class is
     * declared like this, it will only be available within the package.
     * 
     * protected: (used in constructors, inner classes, methods, and class fields)
     * An access modifier at the package level and in the inheritance hierarchy.
     * 
     * public: (used in classes, constructors, interfaces, inner classes, methods
     * and class fields) - Public access modifier, available to everyone.
     * 
     * 
     * The sequence of modifiers in descending order of privacy level: private,
     * default ,protected, public).
     * 
     * 
     * 
     * HOW DOES AN ABSTRACT CLASS DIFFER FROM AN INTERFACE? WHEN WOULD YOU USE AN
     * ABSTRACT CLASS AND WHEN WOULD YOU USE THE INTERFACE?
     * 
     * 
     * 
     * An abstract class is a class that is marked "abstract" and may or may not
     * contain abstract methods. An instance of an abstract class cannot be
     * instantiated. A class that inherits from an abstract class may or may not
     * implement abstract methods. In case child class doesn’t implement all
     * abstract methods, then it must also be abstract. Also, if the inheritor class
     * overrides the method implemented in the abstract parent class, it can be
     * overridden with the abstract modifier! That is, to abandon the
     * implementation. Accordingly, this class must also be abstract as well.
     * 
     * 
     * 
     * As for the interface, it contains only abstract methods and constants, this
     * was the case before the release of Java 8. Starting with Java 8, in addition
     * to abstract methods, we can also use standard methods (default methods) and
     * static methods (static methods) in interfaces.
     * 
     * A Default method in an interface is a method in an interface with default
     * logic that is not required to be defined in the implementation of that
     * interface.
     * 
     * Static methods in an interface are essentially the same as static methods in
     * an abstract class.
     * 
     * 
     * 
     * When implementing an interface, a class must implement all methods of the
     * interface. Otherwise, the class must be marked as abstract. An interface can
     * also contain inner classes. And no abstract methods in them.
     * 
     * 
     * 
     * Also, always remember that you can extend only one class in Java, but you can
     * implement multiple interfaces.
     * 
     * 
     * 
     * What to use: Interface or Abstract class?
     * 
     * An abstract class is used when we need some kind of default implementation.
     * An interface is used when a class needs to specify specific behavior. Often
     * an interface and an abstract class are combined, i.e. implement an interface
     * in an abstract class to specify the default behavior and implementation.
     * 
     * 
     * 
     * 
     * 
     * CAN AN OBJECT ACCESS A PRIVATE CLASS VARIABLE? IF YES, HOW?
     * 
     * 
     * 
     * In general, a private class variable can only be accessed within the class in
     * which it is declared. Private variables can also be accessed through the Java
     * Reflection API.
     * 
     * 
     * 
     * 
     * 
     * IS IT POSSIBLE TO OVERLOAD A STATIC METHOD?
     * 
     * 
     * 
     * Static methods can be overloaded by non-static methods and vice versa -
     * without restrictions. But there is no point in overriding a static method.
     * 
     * 
     * 
     * 
     * 
     * TELL ME ABOUT INTERNAL CLASSES. WHEN WILL YOU USE THEM?
     * 
     * 
     * 
     * An inner class is a class that exists within a class or interface. In doing
     * so, it gains access to all fields and methods of its outer class.
     * 
     * What can it be used for? For example, to provide some additional class logic
     * and encapsulate it. Although the use of inner classes complicates the
     * program, it is recommended to avoid their use.
     * 
     * 
     * 
     * 
     * 
     * WHAT IS THE DIFFERENCE BETWEEN AN INSTANCE VARIABLE AND A STATIC VARIABLE?
     * GIVE AN EXAMPLE.
     * 
     * 
     * 
     * Static variables are initialized when the class is loaded by the classloader,
     * and do not depend on the object. An instance variable is initialized when the
     * class is created.
     * 
     * Example: For example, we need a global variable for all objects of a class,
     * such as the number of visits by users of a particular article on the
     * Internet. Each time an article is visited, a new object is created and the
     * visits variable is incremented. The visits variable is a static variable that
     * remains the same for all instances of the same class.
     * 
     * 
     * 
     * 
     * 
     * TELL ABOUT TYPE CASTING. WHEN DO YOU RECEIVE CLASSCASTEXCEPTION?
     * 
     * 
     * 
     * Type casting is setting the type of a variable or object to something other
     * than the current type. There are two types of cast in jew:
     * 
     * automatic
     * 
     * not automatic
     * 
     * 
     * 
     * Automatic happens for example in such cases:
     * 
     * byte->short->int->long->float->double
     * 
     * that is, if we extend the type, then no explicit conversion is required, the
     * cast happens automatically. If we are narrowing, then it is necessary to
     * explicitly specify the type conversion.
     * 
     * 
     * 
     * In the case of objects, we can automatically cast from the child type to the
     * parent, but not vice versa, then a ClassCastException will be thrown.
     * 
     * 
     * 
     * 
     * 
     * WHAT IS A STATIC CLASS, WHAT ARE THE FEATURES OF ITS USE?
     * 
     * 
     * 
     * A static class can only be an nested class (a class definition is placed
     * inside another class). An object of an ordinary inner class holds a reference
     * to an object of the outer class. There is no such reference inside a static
     * inner class.
     * 
     * 
     * 
     * That is: An object of an outer class is not needed to create an object of a
     * static inner class. From an object of a static nested class, you cannot
     * directly access the non-static members of the outer class. Also, ordinary
     * inner classes cannot contain static methods and members.
     * 
     * 
     * 
     * Why do we need nested classes at all? Each inner class is able to
     * independently inherit a specific implementation. Thus, the nested class is
     * not restricted from being inherited in situations where the outer class
     * already inherits the implementation. That is, it is like a solution to the
     * problem of multiple inheritance.
     * 
     * 
     * 
     * 
     * 
     * WHAT TYPES OF INNER CLASSES ARE THERE? WHAT ARE THEY USED FOR?
     * 
     * 
     * 
     * Nested classes exist within other classes. A normal class is a full member of
     * a package. Nested classes, which have been available since Java 1.1, can be
     * of four types:
     * 
     * static nested classes
     * 
     * non-static inner classes
     * 
     * local classes
     * 
     * anonymous classes
     * 
     * 
     * 
     * Static nested classes - like any other static method, it has access to any
     * static methods of its outer class, including private ones. It cannot access
     * non-static fields and methods of the enclosing class directly. It can only
     * use them through a reference to an instance of the parent's class.
     * 
     * 
     * 
     * Non-static inner classes - classes that are declared inside other class and
     * that are have access to the non-static properties of the outer parent class.
     * 
     * 
     * 
     * Local classes are classes that are defined in a block, which is a group of
     * zero or more statements between balanced braces. You typically find local
     * classes defined in the body of a method.
     * 
     * 
     * 
     * Anonymous Classes - These class types do not have a name and are only visible
     * inside the block.
     * 
     * IS IT POSSIBLE TO CHANGE WHEN OVERRIDE THE METHOD:
     * 
     * Access Modifier
     * 
     * return type
     * 
     * Argument type or number of arguments
     * 
     * Argument name
     * 
     * Change the order, quantity, or remove the throws section altogether?
     * 
     * 
     * 
     * Yes, if you expand (package -> protected -> public)
     * 
     * Yes, if Downcasting is performed (downcasting, conversion down the
     * hierarchy), that is, the return type in the overridden method of the heir
     * class must NOT be wider than in the parent class (Object -> Number ->
     * Integer)
     * 
     * No, in this case, Overload occurs
     * 
     * Yes
     * 
     * It is possible to change the order. It is possible to remove the throws
     * section from the method altogether, since it is already defined. It is also
     * possible to add new exceptions that inherit from declared or runtime
     * exceptions.
     * 
     * 
     * 
     * Method overriding is valid when classes are inherited, i.e. a method with the
     * same signature is declared in the descendant class as in the parent class.
     * This means that this method has overridden the method of its superclass.
     * 
     * 
     * 
     * A few points about this:
     * 
     * The access modifier in the method of the descendant class must be NOT
     * narrower than in the parent class, otherwise there will be a compilation
     * error.
     * 
     * The description of the exception in the overridden method of the descendant
     * class must NOT be wider than in the parent class, otherwise a compilation
     * error will appear.
     * 
     * A method declared as "private" in a parent class cannot be overridden!
     * 
     * 
     * 
     * 
     * 
     * WHAT IS A DEFAULT CONSTRUCTOR?
     * 
     * 
     * 
     * In Java, if there are no explicitly defined constructors in a class, then the
     * compiler uses an implicitly defined default constructor, which is similar to
     * a "pure" default constructor. The default constructor is a fairly simple
     * construct, which boils down to creating a constructor for a type with no
     * parameters. So, for example, if a user-defined constructor is not declared
     * when declaring a non-static class (it doesn’t matter if it has parameters or
     * without them), then the compiler will independently generate a constructor
     * without parameters. Some programmers explicitly set a default constructor out
     * of habit so they don't forget later, but this is not necessary.
     * 
     * 
     * 
     * In Java, if the derived class does not explicitly call the base class
     * constructor (in Java, using super() in the first line), then the default
     * constructor is implicitly called. If the base class does not have a default
     * constructor, then this is considered an error.
     * 
     * 
     */
}
