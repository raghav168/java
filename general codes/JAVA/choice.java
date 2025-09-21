import java.util.Scanner;
class calculator{
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("enter no1: ");
   int a = scan.nextInt();
System.out.println("enter no2: ");
   int b = scan.nextInt();
System.out.println("a. Addition");
System.out.println("b. Subtraction");
System.out.println("c. Multiplication");
System.out.println("d. Division");

System.out.println("enter choice(a-b): ");
   String x = scan.next();
if(x.equals("a")){
System.out.println(a+b);
}
else if(x.equals("b")){
System.out.println(a-b);
}
else if(x.equals("c")){
System.out.println(a*b);
}
else if(x.equals("d")){
System.out.println(a/b);
}
else{
System.out.println("wrong choice");
}
}
}
