import java.util.Scanner;

public class operations{
 int sum(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 2 numbers");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c;
 c=a+b;
System.out.println(c);
return c;
}

void eve(){
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n");
  	n=sc.nextInt();
  if(n%2==0)
 {
   System.out.println("Number is even");
 }
 else
   System.out.println("Number is odd");
}


int factorial(){
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n");
  n=sc.nextInt();
  int fact=1;
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
  }
System.out.println(fact);
return fact;
}

  void reverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed string = " + rev);
    }

    void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if (original == rev)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }

    void maxArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum element = " + max);
    }

    void checkPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1)
            isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operations op = new operations();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Sum of 2 numbers");
            System.out.println("2. Even or Odd");
            System.out.println("3. Factorial");
            System.out.println("4. Reverse a string");
            System.out.println("5. Check Palindrome Number");
            System.out.println("6. Max of Array");
            System.out.println("7. Check Prime");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    op.sum();
                    break;
                case 2:
                    op.eve();
                    break;
                case 3:
                    op.factorial();
                    break;
                case 4:
                    op.reverseString();
                    break;
                case 5:
                    op.checkPalindrome();
                    break;
                case 6:
                    op.maxArray();
                    break;
                case 7:
                    op.checkPrime();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);

        sc.close();
    }
}