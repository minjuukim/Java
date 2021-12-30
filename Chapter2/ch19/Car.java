package ch19;

public class Car {
	private static int number = 10001;
	private int carNum;
	
	public Car() {
		number++;
		carNum = number;
	}

	public static int getNumber() {
		return number;
	}
	
	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	
}
