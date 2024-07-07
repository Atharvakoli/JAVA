package MainConcepts.multiplyInheritance;

public class MultiplyInheritance {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
    }
}

interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Eagle implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Eagle eats");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }
}