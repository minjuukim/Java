package ch08;

public class Order {
	public String orderNum;
	public int orderPhoneNum;
	public String orderAdd;
	public int orderDate;
	public int orderTime;
	public int orderPrice;
	public int menuNum;
	
	public Order(String orderNum, int orderPhoneNum, String orderAdd, int orderDate, int orderTime, int orderPrice, int menuNum) {
		this.orderNum = orderNum;
		this.orderPhoneNum = orderPhoneNum;
		this.orderAdd = orderAdd;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
	}
	
	void showOrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ: " + orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + orderPhoneNum);
		System.out.println("�ֹ� �� �ּ�: " + orderAdd);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ� �ð�: " + orderTime);
		System.out.println("�ֹ� ����: " + orderPrice);
		System.out.println("�޴� ��ȣ: " + menuNum);
	}
}
