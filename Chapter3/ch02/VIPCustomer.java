package ch02;

public class VIPCustomer extends Customer {
	
	double salesRatio;	// 할인 비율
	private int agentID;		// 담당 상담원 id
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
