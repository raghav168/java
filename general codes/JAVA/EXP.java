import java.util.Scanner;
class temperature{
public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
    System.out.println("RAGHAV 24CSU168");
    System.out.println("convert from: 1) Celcius to Farenheit 2) Farenheit to Celcius (1 or 2)? ");
    int choice= scan.nextInt();
    if(choice==1){
        System.out.println("enter temperature in celcius :");
        float c = scan.nextFloat();
        float f = ( c * 9/5) + 32;
        System.out.println("temp in farenheit is: " + f);
}
   else if(choice ==2){
        System.out.println("enter temperature in farenheit:");
        float f = scan.nextFloat();
        float c = (f - 32) * 5/9;
        System.out.println("temp in celcius is: " + c);
}
      else{
       System.out.println("wrong choice!!");
}
}
}
