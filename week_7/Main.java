// Interface for flying behavior
interface Flyable {
    void fly();
}

// Interface for swimming behavior
interface Swimmable {
    void swim();
}

// Concrete class implementing both Flyable and Swimmable interfaces
class Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming.");
    }
}

// Concrete class implementing Flyable interface
class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying.");
    }
}

// Concrete class implementing Swimmable interface
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of Bird, Airplane, and Fish
        Bird bird = new Bird();
        Airplane airplane = new Airplane();
        Fish fish = new Fish();

        // Calling fly and swim methods
        bird.fly();
        bird.swim();

        airplane.fly();

        fish.swim();
    }
}
