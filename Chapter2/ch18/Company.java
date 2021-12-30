package ch18;	// �̱��� ����

public class Company {	// ������ ȸ��� �Ѱ� �ۿ� �����Ƿ�, �ν��Ͻ� �Ѱ��� �����ǵ���.

	// ������ ��ü
	private static Company instance = new Company();
	
	// �ܺο��� Company�� ������� new�� �� ������ �����ڸ� private���� ����
	private Company() {}
	
	// �ܺο��� Ŭ���� �̸����� ȣ���� �� �ֵ��� static �޼���� ����
	public static Company getInstance() {
		if( instance == null) 
			instance = new Company();
		
		return instance;
	}
}
