package ch18;	// 싱글톤 패턴

public class Company {	// 동일한 회사는 한개 밖에 없으므로, 인스턴스 한개만 생성되도록.

	// 유일한 객체
	private static Company instance = new Company();
	
	// 외부에서 Company를 마음대로 new할 수 없도록 생성자를 private으로 제공
	private Company() {}
	
	// 외부에서 클래스 이름으로 호출할 수 있도록 static 메서드로 지정
	public static Company getInstance() {
		if( instance == null) 
			instance = new Company();
		
		return instance;
	}
}
