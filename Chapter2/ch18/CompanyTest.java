package ch18;

// import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		// 만약 getInstance()를 일반 메서드로 선언했다면, 호출하기 위해서 인스턴스를 하나 만들었어야 함
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		// JVM이 할당해준 힙 메모리 주소가 동일함. 인스턴스는 한개만 생성되기 때문
		System.out.println(company1);
		System.out.println(company2);
		
		// Calendar calendar = Calendar.getInstance();
	}

}
