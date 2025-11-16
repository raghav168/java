abstract class Marks{
	abstract double getPercentage();
}
class A extends Marks{
	double m1,m2,m3;
	A(double m1,double m2,double m3){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	double getPercentage(){
		return (m1+m2+m3)/3.0;
	}
}
class B extends Marks{
	double m1,m2,m3,m4;
	B(double m1, double m2, double m3, double m4){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	double getPercentage(){
		return (m1+m2+m3+m4)/4.0;
	}
}

class q5{
	public static void main(String[] args){
		System.out.println("Raghav 24csu168");
		A aobj = new A(53,63,62);
		B bobj = new B(83,76,73,62);

		double a = aobj.getPercentage();
		double b = bobj.getPercentage();
		System.out.println("Percentage of Student A: "+a);
		System.out.println("Percentage of Student B: "+b);
	}
}