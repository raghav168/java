import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");

        System.out.print("Enter number of terms (n): ");
        int n = scan.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.print(a);
        } else {
            System.out.print(a + " " + b);

            for (int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
    }
}
