package MainConcepts.anonymousClasses;

public class AnonymousClasses {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        greeting.sayHello();
    }
}

interface Greeting {
    void sayHello();
}
