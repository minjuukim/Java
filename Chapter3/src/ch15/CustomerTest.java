package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;	// 상위 클래스 타입으로 묵시적으로 형변환.
		buyer.buy();
		buyer.order();	// 재정의된 메서드가 호출됨.
		
		Sell seller = customer;
		seller.sell();
		seller.order();		// 재정의된 메서드가 호출됨.
	}

}
