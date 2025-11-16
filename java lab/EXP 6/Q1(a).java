//Q1(a)
class Animal{
	void eat(){
		System.out.println("Animal can eat.");
	}
}

interface Pet{
	void beFriendly();
}

interface Wild{
	void hunt();
}

class Dog extends Animal implements Pet, Wild {
	public void beFriendly(){
		System.out.println("Dog is friendly.");
	}
	public void hunt(){
		System.out.println("Dog can hunt.");
	}
}

	class TestInheritance{
	public static void main(String[] args){
		System.out.println("Raghav 24csu168");
		Dog d = new Dog();
		d.eat();
		d.beFriendly();
		d.hunt();
	}
}
