package Day6.relationships;

public class Account {
	
	private int accNo;
	private String ifscCode;
	
	public Account() {
		
	}

	public Account(int accNo, String ifscCode) {
		this.accNo = accNo;
		this.ifscCode = ifscCode;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ifscCode=" + ifscCode + "]";
	}
}
