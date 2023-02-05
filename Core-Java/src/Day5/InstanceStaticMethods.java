package Day5;

public class InstanceStaticMethods {
	
	private int amount;
	private int accountNumber;
	
	public InstanceStaticMethods(int amount, int accountNumber) {
		this.amount = amount;
		this.accountNumber = accountNumber;
	}
	
	//Static or class methods
	static void sayGoodMorning() {
		System.out.println("Good Morning !! Welcome to SBI");
	}
	
	static void sayGoodBye() {
		System.out.println("Thanks for banking with us.");
	}
	
	//Instance or object methods
	int deposit(int amt) {
		return amount += amt;
	}
	
	int withdraw(int amt) {
		return amount -= amt;
	}
	
	int miniStatement() {
		return amount;
	}

	public static void main(String[] args) {
		InstanceStaticMethods person1 = new InstanceStaticMethods(10000, 1001);
		InstanceStaticMethods.sayGoodMorning();
		person1.deposit(2000);
		person1.withdraw(1000);
		System.out.println(person1.miniStatement());
		InstanceStaticMethods.sayGoodBye();
	}
}
