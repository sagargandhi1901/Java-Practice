package Day6;

public class SingletonClassDemo {
	
	private static final SingletonClassDemo SINGLETON_CLASS_OBJ = new SingletonClassDemo();
	
	private SingletonClassDemo() {
		
	}
	
	public static SingletonClassDemo getSingletonClassObj() {
		return SINGLETON_CLASS_OBJ;
	}
	
	public static void main(String[] args) {
		SingletonClassDemo obj1 = SingletonClassDemo.getSingletonClassObj();
		SingletonClassDemo obj2 = SingletonClassDemo.getSingletonClassObj();
		SingletonClassDemo obj3 = SingletonClassDemo.getSingletonClassObj();
		SingletonClassDemo obj4 = SingletonClassDemo.getSingletonClassObj();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}
}
