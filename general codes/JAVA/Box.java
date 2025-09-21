import java.util.Scanner;
class Box{
  double width;
  double height;
  double depth;
  void setDim()
  {
    Scanner sc=new Scanner(System.in);
    width=sc.nextDouble();
    height=sc.nextDouble();
    depth=sc.nextDouble();
  }
double volume()
{
  return depth*height*depth;
}
}

public class BoxDemo{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Box b=new Box();
    b.setDim();	
    b.volume();
}
}