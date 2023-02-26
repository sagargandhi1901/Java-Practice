package Day6;

public final class ImmutableObjectsDemo {

	private final int bookId;
	private final String bookName;
	
	public ImmutableObjectsDemo(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public static void main(String[] args) {
		ImmutableObjectsDemo book1 = new ImmutableObjectsDemo(10, "Complete reference java");
		System.out.println(book1.bookId);
		System.out.println(book1.bookName);
	}
}
