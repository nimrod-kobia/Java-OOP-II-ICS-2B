// BAD DESIGN: Assumes all vehicles can fly
abstract class Vehicle {
    public abstract void fly(); // Bad assumption
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

// Plane can fly - fine
class Plane extends Vehicle {
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}

// Car cannot fly - forced to override fly() anyway
class Car extends Vehicle {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Cars can't fly!");
    }

    public void drive() {
        System.out.println("Car is driving on the road");
    }
}

public class BadLiskov {
    public static void makeItFly(Vehicle vehicle) {
        vehicle.fly(); // We assume all vehicles can fly!
    }

    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle car = new Car();

        makeItFly(plane); // OK
        makeItFly(car);   // LSP is violated
    }
}
