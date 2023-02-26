package Day6.relationships;

public class EmployeeTest {

	public static void main(String[] args) {
		Account account = new Account(123, "SBI01");
		DateOfBirth dateOfBirth = new DateOfBirth(19, "Jan", 1998);
		Location location = new Location(123.45F, 789.12F);
		Address address = new Address("71-A", "Meerut", 250404, location);
		Employee employee = new Employee(97, "Sagar", 25, account, address, dateOfBirth);
		
		System.out.println(employee);
	}
}
