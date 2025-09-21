import java.util.Scanner;
class Box{
  private double width;
  private double height;
  private double depth;
  public void setDim(){
      Scanner scan = new Scanner(System.in);
      System.out.print("enter width: ");
      width  = scan.nextInt();
      System.out.print("enter height: ");
      height = scan.nextInt();
      System.out.print("enter depth: ");
      depth = scan.nextInt();
}
  public void doubleVolume(){
      System.out.print("volume is: " + width*height*depth);
}
}

class BoxDemo{
   public static void main(String[] args) {
   Box b = new Box();
   b.setDim();
   b.doubleVolume();
}
}