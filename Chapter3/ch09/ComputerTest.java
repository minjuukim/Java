package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
//		Computer computer = new Computer();	 에러. 추상클래스는 new 될 수 없음.
		desktop.display();
	}

}
