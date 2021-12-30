package ch15;

public class TakeTransTest {

	public static void main(String[] args) {
		Client clientE = new Client("Edward", 20000);
		
		Taxi taxi1 = new Taxi("잘나간다 운수");
		clientE.takeTaxi(taxi1);
		
		clientE.showClientInfo();
		taxi1.showTaxiInfo();
	}

}
