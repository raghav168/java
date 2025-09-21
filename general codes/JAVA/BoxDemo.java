import java.util.Scanner;

class Box {

	private double width;
	private double height;
	private double depth;

    Box() {
        width = 0;
        depth = 0;
        System.out.println("Non-parameterized constructor called");
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Parameterized constructor called");
    }

    void setDim() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = scan.nextDouble();
        System.out.print("Enter height: ");
        height = scan.nextDouble();
        System.out.print("Enter depth: ");
        depth = scan.nextDouble();
    }

   public void doubleVolume() {
        System.out.println("Volume is: " + width * height * depth);
    }
}


class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDim();
        b1.doubleVolume();

        Box b2 = new Box(5, 6, 7);
        b2.doubleVolume();
    }
}	