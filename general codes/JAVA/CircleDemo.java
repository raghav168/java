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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
	double r =sc.nextDouble();
        // a) Create object of type Circle
        Circle c = new Circle();

        // b) Assign value of radius = r
        c.radius = r;

        // c) Display the area
        c.displayArea();
    }
}