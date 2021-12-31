package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];	// ���� ����
		Book[] dcopyLibrary = new Book[5];	// ���� ����
		
		library[0] = new Book("�¹���1", "�����");
		library[1] = new Book("�¹���2", "�����");
		library[2] = new Book("�¹���3", "�����");
		library[3] = new Book("�¹���4", "�����");
		library[4] = new Book("�¹���5", "�����");
		
		dcopyLibrary[0] = new Book();
		dcopyLibrary[1] = new Book();
		dcopyLibrary[2] = new Book();
		dcopyLibrary[3] = new Book();
		dcopyLibrary[4] = new Book();
		
		// ���� ����
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		// ���� ����
		for(int i=0; i<library.length; i++) {
			dcopyLibrary[i].setAuthor(library[i].getAuthor());
			dcopyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("�ڿϼ�");
		library[0].setTitle("����");
		
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		// library�� copyLibrary�� ���� ����Ǿ����� Ȯ��
		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		// dcopyLibrary ���� ������� ������ Ȯ��
		System.out.println("== deep copy library ==");
		for(Book book : dcopyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
