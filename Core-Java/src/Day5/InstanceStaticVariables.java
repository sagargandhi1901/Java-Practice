package Day5;

public class InstanceStaticVariables {
	
	int x;
	static int y;
	
	public InstanceStaticVariables() {
		x++;
		y++;
	}
	
	public static void main(String[] args) {
		
		InstanceStaticVariables obj1 = new InstanceStaticVariables();
		System.out.println(obj1.x + " " + obj1.y);
		
		InstanceStaticVariables obj2 = new InstanceStaticVariables();
		System.out.println(obj2.x + " " + obj2.y);
		
		InstanceStaticVariables obj3 = new InstanceStaticVariables();
		System.out.println(obj3.x + " " + obj3.y);
	}
}
