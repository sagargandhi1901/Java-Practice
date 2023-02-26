package Day6.relationships;

public class Location {
	
	private float longitude;
	private float lattitude;
	
	public Location() {
	}

	public Location(float longitude, float lattitude) {
		this.longitude = longitude;
		this.lattitude = lattitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLattitute() {
		return lattitude;
	}

	public void setLattitute(float lattitute) {
		this.lattitude = lattitute;
	}

	@Override
	public String toString() {
		return "Location [longitude=" + longitude + ", lattitude=" + lattitude + "]";
	}
	
}
