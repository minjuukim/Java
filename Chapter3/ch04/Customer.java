package ch04;
// �Ϲ� ��
public class Customer {
	// protected: ���� Ŭ���������� ������ ����������, �ܺ� Ŭ���������� ���� �Ұ�.
	// private���� �� ��� ���� -> ���� Ŭ�������� ���� �Ұ�.
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;		// ����Ʈ
	double bonusRatio;	// ����Ʈ ���� ����
	
	/*public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() call");
	}*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) call");
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
}
