package MainConcepts.innerClasses;

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
// Inner classes are classes defined within another class. They can be used to
// logically group classes that are only used in one place, increasing
// encapsulation.

class OuterClass {
    class InnerClass {
        public void display() {
            System.out.println("This is an inner class");
        }
    }
}
