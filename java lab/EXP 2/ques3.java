 import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Raghav 24csu168");
        System.out.print("Enter a single letter: ");
        String str = scan.next();
        if (str.length() != 1) {
            System.out.println("Error! Please enter a single character.");
            return;
        }
        char input = Character.toLowerCase(str.charAt(0));
        if (!(input >= 'a' && input <= 'z')) {
            System.out.println("Error! Input is not a letter.");
        }
        else if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println("Entered character is a vowel.");
        }
        else {
            System.out.println("Entered character is a consonant.");
        }
    }
}