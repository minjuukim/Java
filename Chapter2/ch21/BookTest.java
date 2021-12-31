package ch21;	// ╟╢ц╪ ╧Х©╜

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("еб╧И╩Й╦ф1", "╠Х╧наж");
		library[1] = new Book("еб╧И╩Й╦ф2", "╠Х╧наж");
		library[2] = new Book("еб╧И╩Й╦ф3", "╠Х╧наж");
		library[3] = new Book("еб╧И╩Й╦ф4", "╠Х╧наж");
		library[4] = new Book("еб╧И╩Й╦ф5", "╠Х╧наж");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
