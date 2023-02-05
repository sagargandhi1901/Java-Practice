package Day5;

public class InstanceStaticBlocks {
	
	static int x = 10;
	
	{
		x++;
		System.out.println("Instance block " + x);
	}
	
	static {
		x++;
		System.out.println("Static block " + x);
	}

	public static void main(String[] args) {
		x++;
		System.out.println("Main method " + x);
		new InstanceStaticBlocks();
	}
}
