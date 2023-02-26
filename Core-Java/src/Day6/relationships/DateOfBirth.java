package Day6.relationships;

public class DateOfBirth {
	
	private int day;
	private String month;
	private int year;
	
	public DateOfBirth() {
		
	}

	public DateOfBirth(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "DateOfBirth [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
