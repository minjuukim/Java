package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;	// ���� Ŭ���� Ÿ������ ���������� ����ȯ.
		buyer.buy();
		buyer.order();	// �����ǵ� �޼��尡 ȣ���.
		
		Sell seller = customer;
		seller.sell();
		seller.order();		// �����ǵ� �޼��尡 ȣ���.
	}

}
