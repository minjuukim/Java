package ch01;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("데미안", "헤르만 헤세");
		
		// Book클래스에서 toString 재정의 하기 전: 가상 메모리값 출력
		System.out.println(book);  
		
		String str = new String("test");
		
		// toString이 이미 재정의 되어있기 때문에 문자열 출력.
		System.out.println(str);   // test 출력
		System.out.println(str.toString()); // test 출력

	}

}
