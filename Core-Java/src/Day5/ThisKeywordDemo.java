package Day5;

public class ThisKeywordDemo {
	
	private int productId;
	private String productName;
	private float productPrice;
	
	public ThisKeywordDemo(int productId, String productName, float productPrice) {
		System.out.println("ThisKeywordDemo.ThisKeywordDemo(int, string, float)");
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public ThisKeywordDemo(int productId, String productName) {
		System.out.println("ThisKeywordDemo.ThisKeywordDemo(int, string)");
		this.productId = productId;
		this.productName = productName;
	}
	
	public ThisKeywordDemo(int productId) {
		System.out.println("ThisKeywordDemo.ThisKeywordDemo(int)");
		this.productId = productId;
	}
	
	public ThisKeywordDemo(int productId, float productPrice) {
		this(productId, "laptop");
		System.out.println("ThisKeywordDemo.ThisKeywordDemo(int, float)");
		this.productId = productId;
		this.productPrice = productPrice;
	}
	
	public void printId() {										
		System.out.println(productId);								
	}
	
	public void printName() {
		printPrice();
		this.printId();
		System.out.println(productName);								
	}
	
	public void printPrice() {										
		System.out.println(productPrice);								
	}

	public static void main(String[] args) {
		new ThisKeywordDemo(1, 150.5F);								//Anonymous object
	}
}
