import java.util.Scanner;

class Rhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");
        char choice;
        do {
            System.out.print("Enter number of rows for rhombus: ");
            int n = scan.nextInt();

            // upper half
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // lower half
            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.print("Do you want to try again? (Y/N): ");
            choice = scan.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Program exited.");
    }
}
