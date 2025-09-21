import java.util.Scanner;

class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");
        System.out.print("enter a: ");
        double a = scan.nextDouble();
        System.out.print("enter b: ");
        double b = scan.nextDouble();
        System.out.print("enter c: ");
        double c = scan.nextDouble();
        double d = b*b - 4*a*c;

        if (d>0) {
            double r1 = (-b + Math.sqrt(d))/(2*a);
            double r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("two real and distinct roots:");
            System.out.println("root 1 = " + r1);
            System.out.println("root 2 = " + r2);
        } else if (d == 0) {
            double r = -b / (2*a);
            System.out.println("two real and equal roots:");
            System.out.println("root = " + r);
        } else {
            double rp = -b/(2*a);
            double ip = Math.sqrt(-d) / (2*a);
            System.out.println("Complex roots:");
            System.out.println("root 1 = " + rp + " + " + ip + "i");
            System.out.println("root 2 = " + rp + " - " + ip + "i");
        }
    }
}