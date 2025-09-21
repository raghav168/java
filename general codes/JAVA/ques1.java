/* Q1 - Create an abstract class Shape with an abstract method double getArea(). Create two subclasses: Rectangle with fields length and width, Circle with field radius.
Write a Java program that calculates and displays the area of both shapes using polymorphism.*/


abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 4);
        Shape s2 = new Circle(3);

        System.out.println("Area of Rectangle: " + s1.getArea());
        System.out.println("Area of Circle: " + s2.getArea());
    }
}