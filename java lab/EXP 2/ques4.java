import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");
        System.out.print("enter a number: ");
        int n = scan.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
