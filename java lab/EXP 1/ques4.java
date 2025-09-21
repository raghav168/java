

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");
        System.out.print("Enter a 3-digit number: ");
        int num = scan.nextInt();
        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;
        int sum = d1 + d2 + d3;
        System.out.println("Sum of digits = " + sum);
    }
}
