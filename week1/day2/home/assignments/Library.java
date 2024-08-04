package week1.day2.home.assignments;

public class Library {
	
	public String addBook(String bookTitle) {
		
		System.out.println(bookTitle);
		return bookTitle;
	}
	
	public void issueBook() {
		
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		
		//Created an Object on the own class and executed all the methods
		Library lib = new Library();
		lib.addBook("Harry potter");
		lib.issueBook();
		String bookTitle = lib.addBook("Velpaari");
		
	}

}
