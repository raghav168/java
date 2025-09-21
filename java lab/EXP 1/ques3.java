import java.util.Scanner;

class temperature{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("Temperature in Celsius = " + celsius);
    }
}