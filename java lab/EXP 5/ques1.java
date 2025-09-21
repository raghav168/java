class Shape {
	void display() { 
		System.out.println("This is Shape");
	}
}

class Rectangle extends Shape {
	void displayRectangle() {
		System.out.println("This is Rectangle");
	}
}

class Circle extends Shape{
	void displayCircle(){
		System.out.println("This is Circle");
	}
}

class Square extends Rectangle{
	void displaySquare(){
		System.out.println("Square is a rectangle");
	}
}

class Main {
	public static void main(String[] args){
			System.out.println("RAGHAV 24CSU168");
			Square sq=new Square();
			sq.display();
			sq.displayRectangle();
			sq.displaySquare();
		}
}