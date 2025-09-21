/*Q7 - Create three classes:

Grandfather with method show()

Father extends Grandfather, with method display()

Son extends Father, with method print()
Create an object of Son in main, and call all three methods. */



class Grandfather {
    void show() {
        System.out.println("This is Grandfather's method");
    }
}

class Father extends Grandfather {
    void display() {
        System.out.println("This is Father's method");
    }
}

class Son extends Father {
    void print() {
        System.out.println("This is Son's method");
    }
}

class FamilyTest {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
        s.display();
        s.print();
    }
}
