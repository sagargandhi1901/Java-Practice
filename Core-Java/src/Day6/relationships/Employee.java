package Day6.relationships;

public class Employee {
	
	private int empId;
	private String empName;
	private int age;
	Account account;
	Address address;
	DateOfBirth dateOfBirth;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, int age, Account account, Address address, DateOfBirth dateOfBirth) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.account = account;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", account=" + account
				+ ", address=" + address + ", dateOfBirth=" + dateOfBirth + "]";
	}
}
