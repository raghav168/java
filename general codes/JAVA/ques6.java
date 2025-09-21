/*Q6 - Create a class Vehicle with a constructor that initializes brand. Create a subclass Car that adds a field model and calls the superclass constructor using super(). Demonstrate the constructor chaining in the main method.*/

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called. Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
        System.out.println("Car constructor called. Model: " + model);
    }
}

class TestVehicle {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla");
    }
}
