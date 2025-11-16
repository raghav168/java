//Q1(b)
interface A{
	void show();
}

interface B extends A{
void display();
}

class Demo implements B{
	public void show(){
		System.out.println("Show from A");
	}
	
	public void display(){
		System.out.println("Dislay from B");
	}
}

class InterfaceExtend{
	public static void main(String[] args){
		Demo d = new Demo();
		d.show();
		d.display();
	}
}
		