import java.util.Scanner;
class Circle {
    double radius;  

    double findArea() {
        return Math.PI * radius * radius;
    }

    void displayArea() {
        System.out.println("Area of circle = " + findArea());
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        // a) Create object of type Circle
        Circle c = new Circle();

        // b) Assign value of radius = 2
        c.radius = 2;

        // c) Display the area
        c.displayArea();
    }
}