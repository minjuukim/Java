package ch15;

public class Client {
	String clientName;
	int money;
	
	public Client(String clientName, int money) {
		this.clientName = clientName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showClientInfo() {
		System.out.println(clientName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
