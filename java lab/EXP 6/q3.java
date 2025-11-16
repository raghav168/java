abstract class Shape{
	abstract double RectangleArea(double length,double breadth);
	abstract double SquareArea(double side);
	abstract double CircleArea(double radius);
} 
class Area extends Shape{
	double RectangleArea(double length,double breadth){
		return (length*breadth);
	}
	double SquareArea(double side){
		return (side*side);
	}
	double CircleArea(double radius){
		return (3.14*radius*radius);
	}
}

class q3{
	public static void main(String[] args){
		System.out.println("Raghav 24csu168");
		Area o = new Area();
		double s1,s2,s3;
		s1 = o.RectangleArea(5,4);
		s2 = o.SquareArea(5.5);
		s3 = o.CircleArea(3.5);
		System.out.println("Area of rectangle: "+s1);
		System.out.println("Area of square: "+s2);
		System.out.println("Area of circle: "+s3);
	}
}