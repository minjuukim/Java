package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}	// 추상메서드x, 구현부가 없는 메서드. 재정의 할 수 있음.
	
	final public void run() {	// 하위 클래스에서 재정의 불가
		startCar();	
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
