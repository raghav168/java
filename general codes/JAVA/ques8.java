/*Q8 - Create a base class Shape with a method draw(). Create two subclasses: Circle that overrides draw() to print "Drawing circle", Square that overrides draw() to print "Drawing square".
Write a main method that creates one object each of Circle and Square and calls draw().*/

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();

        c.draw();
        s.draw();
    }
}
