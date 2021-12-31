package ch04;

public class VIPCustomer extends Customer {
	
	double salesRatio;	// ���� ����
	private int agentID;		// ��� ���� id
	
	/*public VIPCustomer() {
	//	super();	���� Ŭ������ default �����ڸ� �ڵ����� ȣ������.
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
		
		System.out.println("VIP Customer(int, String) call");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
