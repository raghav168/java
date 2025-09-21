/* Q3 - Design an abstract class Animal with an abstract method makeSound(). Create three subclasses: Dog, Cat, and Cow, each implementing makeSound() with appropriate output. Create an array of Animal references and call makeSound() on each.*/


abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow says: Moo Moo");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
