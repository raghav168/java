abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank{
	void getBalance(){
		System.out.println("Balance in BankA is $100");
	}
}
class BankB extends Bank{
	void getBalance(){
		System.out.println("Balance in BankB is $150");
	}
}
class BankC extends Bank{
	void getBalance(){
		System.out.println("Balance in BankC is $200");
	}
}
class q4{
	public static void main(String[] args){
		System.out.println("Raghav 24csu168");
		Bank ao = new BankA();
		Bank bo = new BankB();
		Bank co = new BankC();
		ao.getBalance();
		bo.getBalance();
		co.getBalance();
	}
}