import java.util.Scanner;
class operation{
 public static void main(String[] args){
  int choice;
  System.out.println("Enter 1 for ADDITION");
  System.out.println("Enter 2 for SUBTRACTION");
  System.out.println("Enter Choice");
  Scanner sc=new Scanner(System.in);
  choice=sc.nextInt();
  int a;
  int b;
  int c;
  System.out.println("Enter 2 Numbers");
  a=sc.nextInt();
  b=sc.nextInt();
  switch(choice){
   case 1:
           c=a+b;
           System.out.println(c);
    break;
   
   case 2: 
           c=a-b;
           System.out.println(c);
    break;
   default : 
     System.out.println("Wrong Choice");
  }
 }
}
  