import java.util.Scanner;
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public void display() {
        System.out.printf("(%.2f, %.2f)%n", x, y);
    }
}

class PointMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        Point p1 = new Point(x1, y1);

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        Point p2 = new Point(x2, y2);

        System.out.print("Point 1: ");
        p1.display();
        System.out.print("Point 2: ");
        p2.display();

        double dist = Point.distance(p1, p2);
        System.out.printf("Distance between points: %.2f%n", dist);
    }
}
