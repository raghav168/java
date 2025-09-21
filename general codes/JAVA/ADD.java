import java.util.Scanner;
class sum{
public static void main(String[] args){
   System.out.println("RAGHAV 24CSU168");
   Scanner scan = new Scanner(System.in);
    System.out.println("enter number: ");
    int x = scan.nextInt();
    int sum = 0;
    while(x!=0){
       int r = x%10;
       sum = sum+r;
       x = x/10;
}
System.out.println(sum);
}
}