package excersize.OCP;

import java.util.List;

public class ShapeCalculatorOriginal {
    // OCP states that software entities should be open for extension but closed for
    // modification.
    // public double calculateTotalArea(List<Shape> shapes) {
    // double totalArea = 0;
    // for (Shape shape : shapes) {
    // if (shape instanceof Circle) {
    // Circle circle = (Circle) shape;
    // totalArea += Math.PI * Math.pow(circle.getRadius(), 2);
    // } else if (shape instanceof Rectangle) {
    // Rectangle rectangle = (Rectangle) shape;
    // totalArea += rectangle.getWidth() * rectangle.getHeight();
    // }
    // // Add more conditions for other shapes (e.g., Triangle)
    // }
    // return totalArea;
    // }

    public static void main(String[] args) {

    }
}

class ShapeOriginal {
    // Common properties and methods for all shapes
}

class CircleOriginal extends ShapeOriginal {
    // private double radius;

    // public Circle(double radius) {
    // this.radius = radius;
    // }

    // public double getRadius() {
    // return radius;
    // }
}

class RectangleOriginal extends ShapeOriginal {
    // private double width;
    // private double height;

    // public Rectangle(double width, double height) {
    // this.width = width;
    // this.height = height;
    // }

    // public double getWidth() {
    // return width;
    // }

    // public double getHeight() {
    // return height;
    // }
}

// Original Code (Violating OCP):

// In the original code, the ShapeCalculator class contains logic to calculate
// the total area of various shapes.

// However, the code violates the Open/Closed Principle (OCP) because it
// requires modification whenever a new shape is added.

// Each time a new shape is introduced, the calculateTotalArea method needs to
// be updated to include the area calculation logic for the new shape.

// This violates the principle of being closed for modification, as the
// ShapeCalculator class should not need to be modified every time a new shape
// is added.

// Refactored Code (Adhering to OCP):

// In the refactored code, we introduced abstraction by creating an abstract
// Shape class.

// The Shape class defines a method calculateArea, which is abstract and must be
// implemented by concrete subclasses.

// Concrete subclasses like Circle and Rectangle override the calculateArea
// method to provide their specific implementation of area calculation.

// The ShapeCalculator class no longer contains shape-specific logic for area
// calculation. Instead, it delegates the calculation to individual shape
// objects by calling their calculateArea method.

// This design allows for easy extension without modifying existing code. New
// shapes can be added by creating new subclasses of Shape and implementing the
// calculateArea method without needing to modify the ShapeCalculator class.

// By adhering to the Open/Closed Principle (OCP), the codebase becomes more
// flexible, maintainable, and scalable. New shapes can be added without
// impacting existing code, promoting modularity and code reuse.

// In summary, the refactored code separates concerns, promotes abstraction, and
// allows for easy extension without modification, thereby adhering to the
// Open/Closed Principle.
