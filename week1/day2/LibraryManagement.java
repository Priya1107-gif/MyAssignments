package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library lib = new Library();
		String returnedBook = lib.addBook("Python Programming");
		System.out.println("Returned Book Title: " + returnedBook);
		lib.issueBook();
	}

}
