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
		System.out.println("주문 접수 번호: " + orderNum);
		System.out.println("주문 핸드폰 번호: " + orderPhoneNum);
		System.out.println("주문 집 주소: " + orderAdd);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + orderPrice);
		System.out.println("메뉴 번호: " + menuNum);
	}
}
