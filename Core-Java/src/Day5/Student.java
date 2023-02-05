package Day5;

public class Student {
	
	private int studentId;
	private String name;
	private long phoneNumber;
	
	private static String teacher = "Chanti";
	private static String course = "Java";
	
	private static final String COUNTRY_NAME = "India";
	private static final String COUNTRY_CODE = "+91";
	
	public Student(int id, String name, long phoneNumber) {
		this.studentId = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Sagar", 123456789);
	}
}
