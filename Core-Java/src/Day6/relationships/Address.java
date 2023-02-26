package Day6.relationships;

public class Address {
	
	private String houseNo;
	private String city;
	private int pinCode;
	Location location;

	public Address() {
	}

	public Address(String houseNo, String city, int pinCode, Location location) {
		this.houseNo = houseNo;
		this.city = city;
		this.pinCode = pinCode;
		this.location = location;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pinCode=" + pinCode + ", location=" + location
				+ "]";
	}
}
