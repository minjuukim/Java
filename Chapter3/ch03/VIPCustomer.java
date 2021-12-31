package ch03;

public class VIPCustomer extends Customer {
	
	double salesRatio;	// 할인 비율
	private int agentID;		// 담당 상담원 id
	
	/*public VIPCustomer() {
	//	super();	상위 클래스의 default 생성자를 자동으로 호출해줌.
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIP Customer() call");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}

	public int getAgentID() {
		return agentID;
	}
}
