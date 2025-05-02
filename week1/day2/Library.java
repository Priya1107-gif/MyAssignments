package week1.day2;

public class Library {
	// Method to add a book
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}

	// Method to issue a book
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	// Main method to test Library methods directly
	public static void main(String[] args) {
		Library lib = new Library();
		String returnedBook = lib.addBook("Java Programming");
		System.out.println("Returned Book Title: " + returnedBook);
		lib.issueBook();

	}

}
