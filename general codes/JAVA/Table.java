import java.util.Scanner;

public class Table{
 public static void main(String[] args){
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any number : ");
   n=sc.nextInt();
   int i;
   int c;
   for(i=1;i<=10;i++)
   {
     c=n*i;
     System.out.println( n+" * "+i+" = "+c);
   }
}
}