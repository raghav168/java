import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");

        System.out.print("Enter no1: ");
        int a = scan.nextInt();

        System.out.print("Enter no2: ");
        int b = scan.nextInt();

        System.out.println("\nResults:");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }
}