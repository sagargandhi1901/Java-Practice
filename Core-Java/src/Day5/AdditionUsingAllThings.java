package Day5;

public class AdditionUsingAllThings {

	private double num1;
	private double num2;

	// non parameterizedConstructor
	public AdditionUsingAllThings() {
		
	}

	// parameterized Constructor
	public AdditionUsingAllThings(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// toString
	@Override
	public String toString() {
		return "num1 = " + num1 + ", num2 = " + num2;
	}

	// Setters and getters
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getNum2() {
		return num2;
	}

	// Business logic method
	private double doAddition() {
		return (num1 + num2);
	}

	public static void main(String[] args) {

		// Testing constructor and toString
		AdditionUsingAllThings obj = new AdditionUsingAllThings(10D, 20D);
		System.out.println(obj);
		System.out.println(obj.doAddition());

		// Testing setters and getters
		AdditionUsingAllThings obj1 = new AdditionUsingAllThings();
		obj1.setNum1(100D);
		obj1.setNum2(150D);
		System.out.println("num1 = " + obj1.getNum1() + ", num2 = " + obj1.getNum2());
		System.out.println(obj1.doAddition());
	}
}
