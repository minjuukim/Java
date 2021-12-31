package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];	// 얕은 복사
		Book[] dcopyLibrary = new Book[5];	// 깊은 복사
		
		library[0] = new Book("태백산맥1", "김민주");
		library[1] = new Book("태백산맥2", "김민주");
		library[2] = new Book("태백산맥3", "김민주");
		library[3] = new Book("태백산맥4", "김민주");
		library[4] = new Book("태백산맥5", "김민주");
		
		dcopyLibrary[0] = new Book();
		dcopyLibrary[1] = new Book();
		dcopyLibrary[2] = new Book();
		dcopyLibrary[3] = new Book();
		dcopyLibrary[4] = new Book();
		
		// 얕은 복사
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		// 깊은 복사
		for(int i=0; i<library.length; i++) {
			dcopyLibrary[i].setAuthor(library[i].getAuthor());
			dcopyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		// library와 copyLibrary가 같이 변경되었음을 확인
		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		// dcopyLibrary 값은 변경되지 않음을 확인
		System.out.println("== deep copy library ==");
		for(Book book : dcopyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
