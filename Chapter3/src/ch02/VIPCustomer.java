package ch02;

public class VIPCustomer extends Customer {
	
	double salesRatio;	// ÇÒÀÎ ºñÀ²
	private int agentID;		// ´ã´ç »ó´ã¿ø id
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
