package ch15;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	// 생성자가 생성될때 멤버변수를 초기화하는 것이 좋다
	public Shelf() {	
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();	// 가지고 있는 물건의 개수 반환
	}
}
