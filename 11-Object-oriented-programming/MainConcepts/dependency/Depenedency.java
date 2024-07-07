package MainConcepts.dependency;

public class Depenedency {
    public static void main(String[] args) {

    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}