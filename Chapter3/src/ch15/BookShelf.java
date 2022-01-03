package ch15;
// 이미 잘 만들어진 자기보다 일반적인 클래스에서 상속을 받고
// 자기가 구현해야 할 기능이 선언되어있는 인터페이스를 구현.
public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);	
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
